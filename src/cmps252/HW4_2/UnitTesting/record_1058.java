package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("44")
class Record_1058 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1058: FirstName is Loretta")
	void FirstNameOfRecord1058() {
		assertEquals("Loretta", customers.get(1057).getFirstName());
	}

	@Test
	@DisplayName("Record 1058: LastName is Kittelman")
	void LastNameOfRecord1058() {
		assertEquals("Kittelman", customers.get(1057).getLastName());
	}

	@Test
	@DisplayName("Record 1058: Company is A Thomas Plating Co Inc")
	void CompanyOfRecord1058() {
		assertEquals("A Thomas Plating Co Inc", customers.get(1057).getCompany());
	}

	@Test
	@DisplayName("Record 1058: Address is 13718 Mukilteo Spdwy")
	void AddressOfRecord1058() {
		assertEquals("13718 Mukilteo Spdwy", customers.get(1057).getAddress());
	}

	@Test
	@DisplayName("Record 1058: City is Lynnwood")
	void CityOfRecord1058() {
		assertEquals("Lynnwood", customers.get(1057).getCity());
	}

	@Test
	@DisplayName("Record 1058: County is Snohomish")
	void CountyOfRecord1058() {
		assertEquals("Snohomish", customers.get(1057).getCounty());
	}

	@Test
	@DisplayName("Record 1058: State is WA")
	void StateOfRecord1058() {
		assertEquals("WA", customers.get(1057).getState());
	}

	@Test
	@DisplayName("Record 1058: ZIP is 98037")
	void ZIPOfRecord1058() {
		assertEquals("98037", customers.get(1057).getZIP());
	}

	@Test
	@DisplayName("Record 1058: Phone is 425-743-5347")
	void PhoneOfRecord1058() {
		assertEquals("425-743-5347", customers.get(1057).getPhone());
	}

	@Test
	@DisplayName("Record 1058: Fax is 425-743-1897")
	void FaxOfRecord1058() {
		assertEquals("425-743-1897", customers.get(1057).getFax());
	}

	@Test
	@DisplayName("Record 1058: Email is loretta@kittelman.com")
	void EmailOfRecord1058() {
		assertEquals("loretta@kittelman.com", customers.get(1057).getEmail());
	}

	@Test
	@DisplayName("Record 1058: Web is http://www.lorettakittelman.com")
	void WebOfRecord1058() {
		assertEquals("http://www.lorettakittelman.com", customers.get(1057).getWeb());
	}
}
