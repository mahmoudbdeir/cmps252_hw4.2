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

@Tag("37")
class Record_2125 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2125: FirstName is Vicente")
	void FirstNameOfRecord2125() {
		assertEquals("Vicente", customers.get(2124).getFirstName());
	}

	@Test
	@DisplayName("Record 2125: LastName is Schwabenbauer")
	void LastNameOfRecord2125() {
		assertEquals("Schwabenbauer", customers.get(2124).getLastName());
	}

	@Test
	@DisplayName("Record 2125: Company is Vining, Robert B Esq")
	void CompanyOfRecord2125() {
		assertEquals("Vining, Robert B Esq", customers.get(2124).getCompany());
	}

	@Test
	@DisplayName("Record 2125: Address is 220 Distribution Dr")
	void AddressOfRecord2125() {
		assertEquals("220 Distribution Dr", customers.get(2124).getAddress());
	}

	@Test
	@DisplayName("Record 2125: City is Birmingham")
	void CityOfRecord2125() {
		assertEquals("Birmingham", customers.get(2124).getCity());
	}

	@Test
	@DisplayName("Record 2125: County is Jefferson")
	void CountyOfRecord2125() {
		assertEquals("Jefferson", customers.get(2124).getCounty());
	}

	@Test
	@DisplayName("Record 2125: State is AL")
	void StateOfRecord2125() {
		assertEquals("AL", customers.get(2124).getState());
	}

	@Test
	@DisplayName("Record 2125: ZIP is 35209")
	void ZIPOfRecord2125() {
		assertEquals("35209", customers.get(2124).getZIP());
	}

	@Test
	@DisplayName("Record 2125: Phone is 205-942-9669")
	void PhoneOfRecord2125() {
		assertEquals("205-942-9669", customers.get(2124).getPhone());
	}

	@Test
	@DisplayName("Record 2125: Fax is 205-942-1201")
	void FaxOfRecord2125() {
		assertEquals("205-942-1201", customers.get(2124).getFax());
	}

	@Test
	@DisplayName("Record 2125: Email is vicente@schwabenbauer.com")
	void EmailOfRecord2125() {
		assertEquals("vicente@schwabenbauer.com", customers.get(2124).getEmail());
	}

	@Test
	@DisplayName("Record 2125: Web is http://www.vicenteschwabenbauer.com")
	void WebOfRecord2125() {
		assertEquals("http://www.vicenteschwabenbauer.com", customers.get(2124).getWeb());
	}
}
