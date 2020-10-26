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

@Tag("36")
class Record_2808 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2808: FirstName is Cristopher")
	void FirstNameOfRecord2808() {
		assertEquals("Cristopher", customers.get(2807).getFirstName());
	}

	@Test
	@DisplayName("Record 2808: LastName is Gregoire")
	void LastNameOfRecord2808() {
		assertEquals("Gregoire", customers.get(2807).getLastName());
	}

	@Test
	@DisplayName("Record 2808: Company is Saratoga Natl")
	void CompanyOfRecord2808() {
		assertEquals("Saratoga Natl", customers.get(2807).getCompany());
	}

	@Test
	@DisplayName("Record 2808: Address is 5600 Jefferson Hwy")
	void AddressOfRecord2808() {
		assertEquals("5600 Jefferson Hwy", customers.get(2807).getAddress());
	}

	@Test
	@DisplayName("Record 2808: City is New Orleans")
	void CityOfRecord2808() {
		assertEquals("New Orleans", customers.get(2807).getCity());
	}

	@Test
	@DisplayName("Record 2808: County is Jefferson")
	void CountyOfRecord2808() {
		assertEquals("Jefferson", customers.get(2807).getCounty());
	}

	@Test
	@DisplayName("Record 2808: State is LA")
	void StateOfRecord2808() {
		assertEquals("LA", customers.get(2807).getState());
	}

	@Test
	@DisplayName("Record 2808: ZIP is 70123")
	void ZIPOfRecord2808() {
		assertEquals("70123", customers.get(2807).getZIP());
	}

	@Test
	@DisplayName("Record 2808: Phone is 504-733-8568")
	void PhoneOfRecord2808() {
		assertEquals("504-733-8568", customers.get(2807).getPhone());
	}

	@Test
	@DisplayName("Record 2808: Fax is 504-733-2701")
	void FaxOfRecord2808() {
		assertEquals("504-733-2701", customers.get(2807).getFax());
	}

	@Test
	@DisplayName("Record 2808: Email is cristopher@gregoire.com")
	void EmailOfRecord2808() {
		assertEquals("cristopher@gregoire.com", customers.get(2807).getEmail());
	}

	@Test
	@DisplayName("Record 2808: Web is http://www.cristophergregoire.com")
	void WebOfRecord2808() {
		assertEquals("http://www.cristophergregoire.com", customers.get(2807).getWeb());
	}
}
