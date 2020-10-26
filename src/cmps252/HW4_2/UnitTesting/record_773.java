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

@Tag("44")
class Record_773 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 773: FirstName is Lucius")
	void FirstNameOfRecord773() {
		assertEquals("Lucius", customers.get(772).getFirstName());
	}

	@Test
	@DisplayName("Record 773: LastName is Stehlin")
	void LastNameOfRecord773() {
		assertEquals("Stehlin", customers.get(772).getLastName());
	}

	@Test
	@DisplayName("Record 773: Company is Saint Joseph Co Medical Scty")
	void CompanyOfRecord773() {
		assertEquals("Saint Joseph Co Medical Scty", customers.get(772).getCompany());
	}

	@Test
	@DisplayName("Record 773: Address is 514 Congress St")
	void AddressOfRecord773() {
		assertEquals("514 Congress St", customers.get(772).getAddress());
	}

	@Test
	@DisplayName("Record 773: City is Troy")
	void CityOfRecord773() {
		assertEquals("Troy", customers.get(772).getCity());
	}

	@Test
	@DisplayName("Record 773: County is Rensselaer")
	void CountyOfRecord773() {
		assertEquals("Rensselaer", customers.get(772).getCounty());
	}

	@Test
	@DisplayName("Record 773: State is NY")
	void StateOfRecord773() {
		assertEquals("NY", customers.get(772).getState());
	}

	@Test
	@DisplayName("Record 773: ZIP is 12180")
	void ZIPOfRecord773() {
		assertEquals("12180", customers.get(772).getZIP());
	}

	@Test
	@DisplayName("Record 773: Phone is 518-272-3152")
	void PhoneOfRecord773() {
		assertEquals("518-272-3152", customers.get(772).getPhone());
	}

	@Test
	@DisplayName("Record 773: Fax is 518-272-4809")
	void FaxOfRecord773() {
		assertEquals("518-272-4809", customers.get(772).getFax());
	}

	@Test
	@DisplayName("Record 773: Email is lucius@stehlin.com")
	void EmailOfRecord773() {
		assertEquals("lucius@stehlin.com", customers.get(772).getEmail());
	}

	@Test
	@DisplayName("Record 773: Web is http://www.luciusstehlin.com")
	void WebOfRecord773() {
		assertEquals("http://www.luciusstehlin.com", customers.get(772).getWeb());
	}
}
