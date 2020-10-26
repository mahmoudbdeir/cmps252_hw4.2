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

@Tag("8")
class Record_1389 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1389: FirstName is Marisela")
	void FirstNameOfRecord1389() {
		assertEquals("Marisela", customers.get(1388).getFirstName());
	}

	@Test
	@DisplayName("Record 1389: LastName is Marasigan")
	void LastNameOfRecord1389() {
		assertEquals("Marasigan", customers.get(1388).getLastName());
	}

	@Test
	@DisplayName("Record 1389: Company is Mantel Cohen Garelick Ryswerg")
	void CompanyOfRecord1389() {
		assertEquals("Mantel Cohen Garelick Ryswerg", customers.get(1388).getCompany());
	}

	@Test
	@DisplayName("Record 1389: Address is 89 Madison St")
	void AddressOfRecord1389() {
		assertEquals("89 Madison St", customers.get(1388).getAddress());
	}

	@Test
	@DisplayName("Record 1389: City is Newark")
	void CityOfRecord1389() {
		assertEquals("Newark", customers.get(1388).getCity());
	}

	@Test
	@DisplayName("Record 1389: County is Essex")
	void CountyOfRecord1389() {
		assertEquals("Essex", customers.get(1388).getCounty());
	}

	@Test
	@DisplayName("Record 1389: State is NJ")
	void StateOfRecord1389() {
		assertEquals("NJ", customers.get(1388).getState());
	}

	@Test
	@DisplayName("Record 1389: ZIP is 7105")
	void ZIPOfRecord1389() {
		assertEquals("7105", customers.get(1388).getZIP());
	}

	@Test
	@DisplayName("Record 1389: Phone is 973-589-4649")
	void PhoneOfRecord1389() {
		assertEquals("973-589-4649", customers.get(1388).getPhone());
	}

	@Test
	@DisplayName("Record 1389: Fax is 973-589-1339")
	void FaxOfRecord1389() {
		assertEquals("973-589-1339", customers.get(1388).getFax());
	}

	@Test
	@DisplayName("Record 1389: Email is marisela@marasigan.com")
	void EmailOfRecord1389() {
		assertEquals("marisela@marasigan.com", customers.get(1388).getEmail());
	}

	@Test
	@DisplayName("Record 1389: Web is http://www.mariselamarasigan.com")
	void WebOfRecord1389() {
		assertEquals("http://www.mariselamarasigan.com", customers.get(1388).getWeb());
	}
}
