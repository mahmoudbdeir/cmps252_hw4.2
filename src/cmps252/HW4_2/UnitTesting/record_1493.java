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

@Tag("37")
class Record_1493 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1493: FirstName is Rick")
	void FirstNameOfRecord1493() {
		assertEquals("Rick", customers.get(1492).getFirstName());
	}

	@Test
	@DisplayName("Record 1493: LastName is Holzer")
	void LastNameOfRecord1493() {
		assertEquals("Holzer", customers.get(1492).getLastName());
	}

	@Test
	@DisplayName("Record 1493: Company is Moore, Jeffrey H Esq")
	void CompanyOfRecord1493() {
		assertEquals("Moore, Jeffrey H Esq", customers.get(1492).getCompany());
	}

	@Test
	@DisplayName("Record 1493: Address is 1125 Virginia Dr")
	void AddressOfRecord1493() {
		assertEquals("1125 Virginia Dr", customers.get(1492).getAddress());
	}

	@Test
	@DisplayName("Record 1493: City is Fort Washington")
	void CityOfRecord1493() {
		assertEquals("Fort Washington", customers.get(1492).getCity());
	}

	@Test
	@DisplayName("Record 1493: County is Montgomery")
	void CountyOfRecord1493() {
		assertEquals("Montgomery", customers.get(1492).getCounty());
	}

	@Test
	@DisplayName("Record 1493: State is PA")
	void StateOfRecord1493() {
		assertEquals("PA", customers.get(1492).getState());
	}

	@Test
	@DisplayName("Record 1493: ZIP is 19034")
	void ZIPOfRecord1493() {
		assertEquals("19034", customers.get(1492).getZIP());
	}

	@Test
	@DisplayName("Record 1493: Phone is 215-283-4136")
	void PhoneOfRecord1493() {
		assertEquals("215-283-4136", customers.get(1492).getPhone());
	}

	@Test
	@DisplayName("Record 1493: Fax is 215-283-6326")
	void FaxOfRecord1493() {
		assertEquals("215-283-6326", customers.get(1492).getFax());
	}

	@Test
	@DisplayName("Record 1493: Email is rick@holzer.com")
	void EmailOfRecord1493() {
		assertEquals("rick@holzer.com", customers.get(1492).getEmail());
	}

	@Test
	@DisplayName("Record 1493: Web is http://www.rickholzer.com")
	void WebOfRecord1493() {
		assertEquals("http://www.rickholzer.com", customers.get(1492).getWeb());
	}
}
