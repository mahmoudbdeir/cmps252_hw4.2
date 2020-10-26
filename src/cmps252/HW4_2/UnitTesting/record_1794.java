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

@Tag("4")
class Record_1794 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1794: FirstName is Harvey")
	void FirstNameOfRecord1794() {
		assertEquals("Harvey", customers.get(1793).getFirstName());
	}

	@Test
	@DisplayName("Record 1794: LastName is Conrath")
	void LastNameOfRecord1794() {
		assertEquals("Conrath", customers.get(1793).getLastName());
	}

	@Test
	@DisplayName("Record 1794: Company is Alaska Seafood Co")
	void CompanyOfRecord1794() {
		assertEquals("Alaska Seafood Co", customers.get(1793).getCompany());
	}

	@Test
	@DisplayName("Record 1794: Address is 2009 Jackson St")
	void AddressOfRecord1794() {
		assertEquals("2009 Jackson St", customers.get(1793).getAddress());
	}

	@Test
	@DisplayName("Record 1794: City is Oshkosh")
	void CityOfRecord1794() {
		assertEquals("Oshkosh", customers.get(1793).getCity());
	}

	@Test
	@DisplayName("Record 1794: County is Winnebago")
	void CountyOfRecord1794() {
		assertEquals("Winnebago", customers.get(1793).getCounty());
	}

	@Test
	@DisplayName("Record 1794: State is WI")
	void StateOfRecord1794() {
		assertEquals("WI", customers.get(1793).getState());
	}

	@Test
	@DisplayName("Record 1794: ZIP is 54901")
	void ZIPOfRecord1794() {
		assertEquals("54901", customers.get(1793).getZIP());
	}

	@Test
	@DisplayName("Record 1794: Phone is 920-231-4238")
	void PhoneOfRecord1794() {
		assertEquals("920-231-4238", customers.get(1793).getPhone());
	}

	@Test
	@DisplayName("Record 1794: Fax is 920-231-8525")
	void FaxOfRecord1794() {
		assertEquals("920-231-8525", customers.get(1793).getFax());
	}

	@Test
	@DisplayName("Record 1794: Email is harvey@conrath.com")
	void EmailOfRecord1794() {
		assertEquals("harvey@conrath.com", customers.get(1793).getEmail());
	}

	@Test
	@DisplayName("Record 1794: Web is http://www.harveyconrath.com")
	void WebOfRecord1794() {
		assertEquals("http://www.harveyconrath.com", customers.get(1793).getWeb());
	}
}
