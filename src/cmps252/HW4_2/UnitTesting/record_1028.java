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

@Tag("10")
class Record_1028 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1028: FirstName is Ellie")
	void FirstNameOfRecord1028() {
		assertEquals("Ellie", customers.get(1027).getFirstName());
	}

	@Test
	@DisplayName("Record 1028: LastName is ychelmann")
	void LastNameOfRecord1028() {
		assertEquals("ychelmann", customers.get(1027).getLastName());
	}

	@Test
	@DisplayName("Record 1028: Company is Berman, Mitchell S Esq")
	void CompanyOfRecord1028() {
		assertEquals("Berman, Mitchell S Esq", customers.get(1027).getCompany());
	}

	@Test
	@DisplayName("Record 1028: Address is 22343 Se Stark St")
	void AddressOfRecord1028() {
		assertEquals("22343 Se Stark St", customers.get(1027).getAddress());
	}

	@Test
	@DisplayName("Record 1028: City is Gresham")
	void CityOfRecord1028() {
		assertEquals("Gresham", customers.get(1027).getCity());
	}

	@Test
	@DisplayName("Record 1028: County is Multnomah")
	void CountyOfRecord1028() {
		assertEquals("Multnomah", customers.get(1027).getCounty());
	}

	@Test
	@DisplayName("Record 1028: State is OR")
	void StateOfRecord1028() {
		assertEquals("OR", customers.get(1027).getState());
	}

	@Test
	@DisplayName("Record 1028: ZIP is 97030")
	void ZIPOfRecord1028() {
		assertEquals("97030", customers.get(1027).getZIP());
	}

	@Test
	@DisplayName("Record 1028: Phone is 503-666-1735")
	void PhoneOfRecord1028() {
		assertEquals("503-666-1735", customers.get(1027).getPhone());
	}

	@Test
	@DisplayName("Record 1028: Fax is 503-666-7962")
	void FaxOfRecord1028() {
		assertEquals("503-666-7962", customers.get(1027).getFax());
	}

	@Test
	@DisplayName("Record 1028: Email is ellie@ychelmann.com")
	void EmailOfRecord1028() {
		assertEquals("ellie@ychelmann.com", customers.get(1027).getEmail());
	}

	@Test
	@DisplayName("Record 1028: Web is http://www.ellieychelmann.com")
	void WebOfRecord1028() {
		assertEquals("http://www.ellieychelmann.com", customers.get(1027).getWeb());
	}
}
