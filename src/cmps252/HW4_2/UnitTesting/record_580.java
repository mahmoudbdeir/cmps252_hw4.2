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
class Record_580 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 580: FirstName is Porfirio")
	void FirstNameOfRecord580() {
		assertEquals("Porfirio", customers.get(579).getFirstName());
	}

	@Test
	@DisplayName("Record 580: LastName is Loftus")
	void LastNameOfRecord580() {
		assertEquals("Loftus", customers.get(579).getLastName());
	}

	@Test
	@DisplayName("Record 580: Company is Vopal, Edward J Esq")
	void CompanyOfRecord580() {
		assertEquals("Vopal, Edward J Esq", customers.get(579).getCompany());
	}

	@Test
	@DisplayName("Record 580: Address is 725 River Rd")
	void AddressOfRecord580() {
		assertEquals("725 River Rd", customers.get(579).getAddress());
	}

	@Test
	@DisplayName("Record 580: City is Edgewater")
	void CityOfRecord580() {
		assertEquals("Edgewater", customers.get(579).getCity());
	}

	@Test
	@DisplayName("Record 580: County is Bergen")
	void CountyOfRecord580() {
		assertEquals("Bergen", customers.get(579).getCounty());
	}

	@Test
	@DisplayName("Record 580: State is NJ")
	void StateOfRecord580() {
		assertEquals("NJ", customers.get(579).getState());
	}

	@Test
	@DisplayName("Record 580: ZIP is 7020")
	void ZIPOfRecord580() {
		assertEquals("7020", customers.get(579).getZIP());
	}

	@Test
	@DisplayName("Record 580: Phone is 201-945-9638")
	void PhoneOfRecord580() {
		assertEquals("201-945-9638", customers.get(579).getPhone());
	}

	@Test
	@DisplayName("Record 580: Fax is 201-945-3547")
	void FaxOfRecord580() {
		assertEquals("201-945-3547", customers.get(579).getFax());
	}

	@Test
	@DisplayName("Record 580: Email is porfirio@loftus.com")
	void EmailOfRecord580() {
		assertEquals("porfirio@loftus.com", customers.get(579).getEmail());
	}

	@Test
	@DisplayName("Record 580: Web is http://www.porfirioloftus.com")
	void WebOfRecord580() {
		assertEquals("http://www.porfirioloftus.com", customers.get(579).getWeb());
	}
}
