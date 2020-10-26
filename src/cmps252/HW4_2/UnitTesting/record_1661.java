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

@Tag("35")
class Record_1661 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1661: FirstName is Abel")
	void FirstNameOfRecord1661() {
		assertEquals("Abel", customers.get(1660).getFirstName());
	}

	@Test
	@DisplayName("Record 1661: LastName is Blotsky")
	void LastNameOfRecord1661() {
		assertEquals("Blotsky", customers.get(1660).getLastName());
	}

	@Test
	@DisplayName("Record 1661: Company is Rdh Ent Inc")
	void CompanyOfRecord1661() {
		assertEquals("Rdh Ent Inc", customers.get(1660).getCompany());
	}

	@Test
	@DisplayName("Record 1661: Address is 51 Railroad Ave")
	void AddressOfRecord1661() {
		assertEquals("51 Railroad Ave", customers.get(1660).getAddress());
	}

	@Test
	@DisplayName("Record 1661: City is Norwood")
	void CityOfRecord1661() {
		assertEquals("Norwood", customers.get(1660).getCity());
	}

	@Test
	@DisplayName("Record 1661: County is Bergen")
	void CountyOfRecord1661() {
		assertEquals("Bergen", customers.get(1660).getCounty());
	}

	@Test
	@DisplayName("Record 1661: State is NJ")
	void StateOfRecord1661() {
		assertEquals("NJ", customers.get(1660).getState());
	}

	@Test
	@DisplayName("Record 1661: ZIP is 7648")
	void ZIPOfRecord1661() {
		assertEquals("7648", customers.get(1660).getZIP());
	}

	@Test
	@DisplayName("Record 1661: Phone is 201-767-3500")
	void PhoneOfRecord1661() {
		assertEquals("201-767-3500", customers.get(1660).getPhone());
	}

	@Test
	@DisplayName("Record 1661: Fax is 201-767-5558")
	void FaxOfRecord1661() {
		assertEquals("201-767-5558", customers.get(1660).getFax());
	}

	@Test
	@DisplayName("Record 1661: Email is abel@blotsky.com")
	void EmailOfRecord1661() {
		assertEquals("abel@blotsky.com", customers.get(1660).getEmail());
	}

	@Test
	@DisplayName("Record 1661: Web is http://www.abelblotsky.com")
	void WebOfRecord1661() {
		assertEquals("http://www.abelblotsky.com", customers.get(1660).getWeb());
	}
}
