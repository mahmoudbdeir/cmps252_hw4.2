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
class Record_4783 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4783: FirstName is Esperanza")
	void FirstNameOfRecord4783() {
		assertEquals("Esperanza", customers.get(4782).getFirstName());
	}

	@Test
	@DisplayName("Record 4783: LastName is Vanasselt")
	void LastNameOfRecord4783() {
		assertEquals("Vanasselt", customers.get(4782).getLastName());
	}

	@Test
	@DisplayName("Record 4783: Company is Ecologics Lehr")
	void CompanyOfRecord4783() {
		assertEquals("Ecologics Lehr", customers.get(4782).getCompany());
	}

	@Test
	@DisplayName("Record 4783: Address is 2510 Electronic Ln")
	void AddressOfRecord4783() {
		assertEquals("2510 Electronic Ln", customers.get(4782).getAddress());
	}

	@Test
	@DisplayName("Record 4783: City is Dallas")
	void CityOfRecord4783() {
		assertEquals("Dallas", customers.get(4782).getCity());
	}

	@Test
	@DisplayName("Record 4783: County is Dallas")
	void CountyOfRecord4783() {
		assertEquals("Dallas", customers.get(4782).getCounty());
	}

	@Test
	@DisplayName("Record 4783: State is TX")
	void StateOfRecord4783() {
		assertEquals("TX", customers.get(4782).getState());
	}

	@Test
	@DisplayName("Record 4783: ZIP is 75220")
	void ZIPOfRecord4783() {
		assertEquals("75220", customers.get(4782).getZIP());
	}

	@Test
	@DisplayName("Record 4783: Phone is 214-350-2204")
	void PhoneOfRecord4783() {
		assertEquals("214-350-2204", customers.get(4782).getPhone());
	}

	@Test
	@DisplayName("Record 4783: Fax is 214-350-1225")
	void FaxOfRecord4783() {
		assertEquals("214-350-1225", customers.get(4782).getFax());
	}

	@Test
	@DisplayName("Record 4783: Email is esperanza@vanasselt.com")
	void EmailOfRecord4783() {
		assertEquals("esperanza@vanasselt.com", customers.get(4782).getEmail());
	}

	@Test
	@DisplayName("Record 4783: Web is http://www.esperanzavanasselt.com")
	void WebOfRecord4783() {
		assertEquals("http://www.esperanzavanasselt.com", customers.get(4782).getWeb());
	}
}
