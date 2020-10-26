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
class Record_4728 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4728: FirstName is Caleb")
	void FirstNameOfRecord4728() {
		assertEquals("Caleb", customers.get(4727).getFirstName());
	}

	@Test
	@DisplayName("Record 4728: LastName is Fie")
	void LastNameOfRecord4728() {
		assertEquals("Fie", customers.get(4727).getLastName());
	}

	@Test
	@DisplayName("Record 4728: Company is Murphy, Robert W Esq")
	void CompanyOfRecord4728() {
		assertEquals("Murphy, Robert W Esq", customers.get(4727).getCompany());
	}

	@Test
	@DisplayName("Record 4728: Address is 4777 E State St")
	void AddressOfRecord4728() {
		assertEquals("4777 E State St", customers.get(4727).getAddress());
	}

	@Test
	@DisplayName("Record 4728: City is Rockford")
	void CityOfRecord4728() {
		assertEquals("Rockford", customers.get(4727).getCity());
	}

	@Test
	@DisplayName("Record 4728: County is Winnebago")
	void CountyOfRecord4728() {
		assertEquals("Winnebago", customers.get(4727).getCounty());
	}

	@Test
	@DisplayName("Record 4728: State is IL")
	void StateOfRecord4728() {
		assertEquals("IL", customers.get(4727).getState());
	}

	@Test
	@DisplayName("Record 4728: ZIP is 61108")
	void ZIPOfRecord4728() {
		assertEquals("61108", customers.get(4727).getZIP());
	}

	@Test
	@DisplayName("Record 4728: Phone is 815-398-8462")
	void PhoneOfRecord4728() {
		assertEquals("815-398-8462", customers.get(4727).getPhone());
	}

	@Test
	@DisplayName("Record 4728: Fax is 815-398-8591")
	void FaxOfRecord4728() {
		assertEquals("815-398-8591", customers.get(4727).getFax());
	}

	@Test
	@DisplayName("Record 4728: Email is caleb@fie.com")
	void EmailOfRecord4728() {
		assertEquals("caleb@fie.com", customers.get(4727).getEmail());
	}

	@Test
	@DisplayName("Record 4728: Web is http://www.calebfie.com")
	void WebOfRecord4728() {
		assertEquals("http://www.calebfie.com", customers.get(4727).getWeb());
	}
}
