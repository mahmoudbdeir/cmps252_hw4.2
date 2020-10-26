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

@Tag("47")
class Record_367 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 367: FirstName is Joesph")
	void FirstNameOfRecord367() {
		assertEquals("Joesph", customers.get(366).getFirstName());
	}

	@Test
	@DisplayName("Record 367: LastName is Haggermaker")
	void LastNameOfRecord367() {
		assertEquals("Haggermaker", customers.get(366).getLastName());
	}

	@Test
	@DisplayName("Record 367: Company is Wynstone, Neal Esq")
	void CompanyOfRecord367() {
		assertEquals("Wynstone, Neal Esq", customers.get(366).getCompany());
	}

	@Test
	@DisplayName("Record 367: Address is 55 Windsor Ave")
	void AddressOfRecord367() {
		assertEquals("55 Windsor Ave", customers.get(366).getAddress());
	}

	@Test
	@DisplayName("Record 367: City is Mineola")
	void CityOfRecord367() {
		assertEquals("Mineola", customers.get(366).getCity());
	}

	@Test
	@DisplayName("Record 367: County is Nassau")
	void CountyOfRecord367() {
		assertEquals("Nassau", customers.get(366).getCounty());
	}

	@Test
	@DisplayName("Record 367: State is NY")
	void StateOfRecord367() {
		assertEquals("NY", customers.get(366).getState());
	}

	@Test
	@DisplayName("Record 367: ZIP is 11501")
	void ZIPOfRecord367() {
		assertEquals("11501", customers.get(366).getZIP());
	}

	@Test
	@DisplayName("Record 367: Phone is 516-248-7540")
	void PhoneOfRecord367() {
		assertEquals("516-248-7540", customers.get(366).getPhone());
	}

	@Test
	@DisplayName("Record 367: Fax is 516-248-6523")
	void FaxOfRecord367() {
		assertEquals("516-248-6523", customers.get(366).getFax());
	}

	@Test
	@DisplayName("Record 367: Email is joesph@haggermaker.com")
	void EmailOfRecord367() {
		assertEquals("joesph@haggermaker.com", customers.get(366).getEmail());
	}

	@Test
	@DisplayName("Record 367: Web is http://www.joesphhaggermaker.com")
	void WebOfRecord367() {
		assertEquals("http://www.joesphhaggermaker.com", customers.get(366).getWeb());
	}
}
