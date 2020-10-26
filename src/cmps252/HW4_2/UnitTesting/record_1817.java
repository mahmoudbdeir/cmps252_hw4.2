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

@Tag("39")
class Record_1817 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1817: FirstName is Glenda")
	void FirstNameOfRecord1817() {
		assertEquals("Glenda", customers.get(1816).getFirstName());
	}

	@Test
	@DisplayName("Record 1817: LastName is Sitsman")
	void LastNameOfRecord1817() {
		assertEquals("Sitsman", customers.get(1816).getLastName());
	}

	@Test
	@DisplayName("Record 1817: Company is Amercn Fedrn Gran Millers")
	void CompanyOfRecord1817() {
		assertEquals("Amercn Fedrn Gran Millers", customers.get(1816).getCompany());
	}

	@Test
	@DisplayName("Record 1817: Address is 78 Golden St")
	void AddressOfRecord1817() {
		assertEquals("78 Golden St", customers.get(1816).getAddress());
	}

	@Test
	@DisplayName("Record 1817: City is Meriden")
	void CityOfRecord1817() {
		assertEquals("Meriden", customers.get(1816).getCity());
	}

	@Test
	@DisplayName("Record 1817: County is New Haven")
	void CountyOfRecord1817() {
		assertEquals("New Haven", customers.get(1816).getCounty());
	}

	@Test
	@DisplayName("Record 1817: State is CT")
	void StateOfRecord1817() {
		assertEquals("CT", customers.get(1816).getState());
	}

	@Test
	@DisplayName("Record 1817: ZIP is 6450")
	void ZIPOfRecord1817() {
		assertEquals("6450", customers.get(1816).getZIP());
	}

	@Test
	@DisplayName("Record 1817: Phone is 203-630-3873")
	void PhoneOfRecord1817() {
		assertEquals("203-630-3873", customers.get(1816).getPhone());
	}

	@Test
	@DisplayName("Record 1817: Fax is 203-630-9214")
	void FaxOfRecord1817() {
		assertEquals("203-630-9214", customers.get(1816).getFax());
	}

	@Test
	@DisplayName("Record 1817: Email is glenda@sitsman.com")
	void EmailOfRecord1817() {
		assertEquals("glenda@sitsman.com", customers.get(1816).getEmail());
	}

	@Test
	@DisplayName("Record 1817: Web is http://www.glendasitsman.com")
	void WebOfRecord1817() {
		assertEquals("http://www.glendasitsman.com", customers.get(1816).getWeb());
	}
}
