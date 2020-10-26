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

@Tag("13")
class Record_2924 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2924: FirstName is Fred")
	void FirstNameOfRecord2924() {
		assertEquals("Fred", customers.get(2923).getFirstName());
	}

	@Test
	@DisplayName("Record 2924: LastName is Brage")
	void LastNameOfRecord2924() {
		assertEquals("Brage", customers.get(2923).getLastName());
	}

	@Test
	@DisplayName("Record 2924: Company is Dekalb, Stacey A Esq")
	void CompanyOfRecord2924() {
		assertEquals("Dekalb, Stacey A Esq", customers.get(2923).getCompany());
	}

	@Test
	@DisplayName("Record 2924: Address is 1 Dupont St  #-210")
	void AddressOfRecord2924() {
		assertEquals("1 Dupont St  #-210", customers.get(2923).getAddress());
	}

	@Test
	@DisplayName("Record 2924: City is Plainview")
	void CityOfRecord2924() {
		assertEquals("Plainview", customers.get(2923).getCity());
	}

	@Test
	@DisplayName("Record 2924: County is Nassau")
	void CountyOfRecord2924() {
		assertEquals("Nassau", customers.get(2923).getCounty());
	}

	@Test
	@DisplayName("Record 2924: State is NY")
	void StateOfRecord2924() {
		assertEquals("NY", customers.get(2923).getState());
	}

	@Test
	@DisplayName("Record 2924: ZIP is 11803")
	void ZIPOfRecord2924() {
		assertEquals("11803", customers.get(2923).getZIP());
	}

	@Test
	@DisplayName("Record 2924: Phone is 516-349-2129")
	void PhoneOfRecord2924() {
		assertEquals("516-349-2129", customers.get(2923).getPhone());
	}

	@Test
	@DisplayName("Record 2924: Fax is 516-349-4226")
	void FaxOfRecord2924() {
		assertEquals("516-349-4226", customers.get(2923).getFax());
	}

	@Test
	@DisplayName("Record 2924: Email is fred@brage.com")
	void EmailOfRecord2924() {
		assertEquals("fred@brage.com", customers.get(2923).getEmail());
	}

	@Test
	@DisplayName("Record 2924: Web is http://www.fredbrage.com")
	void WebOfRecord2924() {
		assertEquals("http://www.fredbrage.com", customers.get(2923).getWeb());
	}
}
