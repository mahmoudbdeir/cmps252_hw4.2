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

@Tag("19")
class Record_3116 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3116: FirstName is Danna")
	void FirstNameOfRecord3116() {
		assertEquals("Danna", customers.get(3115).getFirstName());
	}

	@Test
	@DisplayName("Record 3116: LastName is Craigwell")
	void LastNameOfRecord3116() {
		assertEquals("Craigwell", customers.get(3115).getLastName());
	}

	@Test
	@DisplayName("Record 3116: Company is Hutchison, Thomas O Esq")
	void CompanyOfRecord3116() {
		assertEquals("Hutchison, Thomas O Esq", customers.get(3115).getCompany());
	}

	@Test
	@DisplayName("Record 3116: Address is 514 W Onondaga St")
	void AddressOfRecord3116() {
		assertEquals("514 W Onondaga St", customers.get(3115).getAddress());
	}

	@Test
	@DisplayName("Record 3116: City is Syracuse")
	void CityOfRecord3116() {
		assertEquals("Syracuse", customers.get(3115).getCity());
	}

	@Test
	@DisplayName("Record 3116: County is Onondaga")
	void CountyOfRecord3116() {
		assertEquals("Onondaga", customers.get(3115).getCounty());
	}

	@Test
	@DisplayName("Record 3116: State is NY")
	void StateOfRecord3116() {
		assertEquals("NY", customers.get(3115).getState());
	}

	@Test
	@DisplayName("Record 3116: ZIP is 13204")
	void ZIPOfRecord3116() {
		assertEquals("13204", customers.get(3115).getZIP());
	}

	@Test
	@DisplayName("Record 3116: Phone is 315-475-5475")
	void PhoneOfRecord3116() {
		assertEquals("315-475-5475", customers.get(3115).getPhone());
	}

	@Test
	@DisplayName("Record 3116: Fax is 315-475-6498")
	void FaxOfRecord3116() {
		assertEquals("315-475-6498", customers.get(3115).getFax());
	}

	@Test
	@DisplayName("Record 3116: Email is danna@craigwell.com")
	void EmailOfRecord3116() {
		assertEquals("danna@craigwell.com", customers.get(3115).getEmail());
	}

	@Test
	@DisplayName("Record 3116: Web is http://www.dannacraigwell.com")
	void WebOfRecord3116() {
		assertEquals("http://www.dannacraigwell.com", customers.get(3115).getWeb());
	}
}
