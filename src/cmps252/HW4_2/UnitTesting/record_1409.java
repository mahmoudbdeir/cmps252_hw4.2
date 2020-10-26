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

@Tag("34")
class Record_1409 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1409: FirstName is Ron")
	void FirstNameOfRecord1409() {
		assertEquals("Ron", customers.get(1408).getFirstName());
	}

	@Test
	@DisplayName("Record 1409: LastName is Reck")
	void LastNameOfRecord1409() {
		assertEquals("Reck", customers.get(1408).getLastName());
	}

	@Test
	@DisplayName("Record 1409: Company is Services Marketing Spec Inc")
	void CompanyOfRecord1409() {
		assertEquals("Services Marketing Spec Inc", customers.get(1408).getCompany());
	}

	@Test
	@DisplayName("Record 1409: Address is 1508 16th Ave S")
	void AddressOfRecord1409() {
		assertEquals("1508 16th Ave S", customers.get(1408).getAddress());
	}

	@Test
	@DisplayName("Record 1409: City is Nashville")
	void CityOfRecord1409() {
		assertEquals("Nashville", customers.get(1408).getCity());
	}

	@Test
	@DisplayName("Record 1409: County is Davidson")
	void CountyOfRecord1409() {
		assertEquals("Davidson", customers.get(1408).getCounty());
	}

	@Test
	@DisplayName("Record 1409: State is TN")
	void StateOfRecord1409() {
		assertEquals("TN", customers.get(1408).getState());
	}

	@Test
	@DisplayName("Record 1409: ZIP is 37212")
	void ZIPOfRecord1409() {
		assertEquals("37212", customers.get(1408).getZIP());
	}

	@Test
	@DisplayName("Record 1409: Phone is 615-386-9992")
	void PhoneOfRecord1409() {
		assertEquals("615-386-9992", customers.get(1408).getPhone());
	}

	@Test
	@DisplayName("Record 1409: Fax is 615-386-9526")
	void FaxOfRecord1409() {
		assertEquals("615-386-9526", customers.get(1408).getFax());
	}

	@Test
	@DisplayName("Record 1409: Email is ron@reck.com")
	void EmailOfRecord1409() {
		assertEquals("ron@reck.com", customers.get(1408).getEmail());
	}

	@Test
	@DisplayName("Record 1409: Web is http://www.ronreck.com")
	void WebOfRecord1409() {
		assertEquals("http://www.ronreck.com", customers.get(1408).getWeb());
	}
}
