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

@Tag("21")
class Record_829 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 829: FirstName is Preston")
	void FirstNameOfRecord829() {
		assertEquals("Preston", customers.get(828).getFirstName());
	}

	@Test
	@DisplayName("Record 829: LastName is Topolski")
	void LastNameOfRecord829() {
		assertEquals("Topolski", customers.get(828).getLastName());
	}

	@Test
	@DisplayName("Record 829: Company is Management Realty Services Inc")
	void CompanyOfRecord829() {
		assertEquals("Management Realty Services Inc", customers.get(828).getCompany());
	}

	@Test
	@DisplayName("Record 829: Address is 151 Dupont St")
	void AddressOfRecord829() {
		assertEquals("151 Dupont St", customers.get(828).getAddress());
	}

	@Test
	@DisplayName("Record 829: City is Plainview")
	void CityOfRecord829() {
		assertEquals("Plainview", customers.get(828).getCity());
	}

	@Test
	@DisplayName("Record 829: County is Nassau")
	void CountyOfRecord829() {
		assertEquals("Nassau", customers.get(828).getCounty());
	}

	@Test
	@DisplayName("Record 829: State is NY")
	void StateOfRecord829() {
		assertEquals("NY", customers.get(828).getState());
	}

	@Test
	@DisplayName("Record 829: ZIP is 11803")
	void ZIPOfRecord829() {
		assertEquals("11803", customers.get(828).getZIP());
	}

	@Test
	@DisplayName("Record 829: Phone is 516-349-1848")
	void PhoneOfRecord829() {
		assertEquals("516-349-1848", customers.get(828).getPhone());
	}

	@Test
	@DisplayName("Record 829: Fax is 516-349-3548")
	void FaxOfRecord829() {
		assertEquals("516-349-3548", customers.get(828).getFax());
	}

	@Test
	@DisplayName("Record 829: Email is preston@topolski.com")
	void EmailOfRecord829() {
		assertEquals("preston@topolski.com", customers.get(828).getEmail());
	}

	@Test
	@DisplayName("Record 829: Web is http://www.prestontopolski.com")
	void WebOfRecord829() {
		assertEquals("http://www.prestontopolski.com", customers.get(828).getWeb());
	}
}
