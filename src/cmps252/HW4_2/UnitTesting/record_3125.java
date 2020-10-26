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

@Tag("40")
class Record_3125 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3125: FirstName is Salvador")
	void FirstNameOfRecord3125() {
		assertEquals("Salvador", customers.get(3124).getFirstName());
	}

	@Test
	@DisplayName("Record 3125: LastName is Bera")
	void LastNameOfRecord3125() {
		assertEquals("Bera", customers.get(3124).getLastName());
	}

	@Test
	@DisplayName("Record 3125: Company is Wyner, James Esq")
	void CompanyOfRecord3125() {
		assertEquals("Wyner, James Esq", customers.get(3124).getCompany());
	}

	@Test
	@DisplayName("Record 3125: Address is 757 Harry L Dr")
	void AddressOfRecord3125() {
		assertEquals("757 Harry L Dr", customers.get(3124).getAddress());
	}

	@Test
	@DisplayName("Record 3125: City is Johnson City")
	void CityOfRecord3125() {
		assertEquals("Johnson City", customers.get(3124).getCity());
	}

	@Test
	@DisplayName("Record 3125: County is Broome")
	void CountyOfRecord3125() {
		assertEquals("Broome", customers.get(3124).getCounty());
	}

	@Test
	@DisplayName("Record 3125: State is NY")
	void StateOfRecord3125() {
		assertEquals("NY", customers.get(3124).getState());
	}

	@Test
	@DisplayName("Record 3125: ZIP is 13790")
	void ZIPOfRecord3125() {
		assertEquals("13790", customers.get(3124).getZIP());
	}

	@Test
	@DisplayName("Record 3125: Phone is 607-797-3472")
	void PhoneOfRecord3125() {
		assertEquals("607-797-3472", customers.get(3124).getPhone());
	}

	@Test
	@DisplayName("Record 3125: Fax is 607-797-0672")
	void FaxOfRecord3125() {
		assertEquals("607-797-0672", customers.get(3124).getFax());
	}

	@Test
	@DisplayName("Record 3125: Email is salvador@bera.com")
	void EmailOfRecord3125() {
		assertEquals("salvador@bera.com", customers.get(3124).getEmail());
	}

	@Test
	@DisplayName("Record 3125: Web is http://www.salvadorbera.com")
	void WebOfRecord3125() {
		assertEquals("http://www.salvadorbera.com", customers.get(3124).getWeb());
	}
}
