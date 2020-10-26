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
class Record_4533 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4533: FirstName is Jill")
	void FirstNameOfRecord4533() {
		assertEquals("Jill", customers.get(4532).getFirstName());
	}

	@Test
	@DisplayName("Record 4533: LastName is Mckeel")
	void LastNameOfRecord4533() {
		assertEquals("Mckeel", customers.get(4532).getLastName());
	}

	@Test
	@DisplayName("Record 4533: Company is Esco Imports Of Texas Inc")
	void CompanyOfRecord4533() {
		assertEquals("Esco Imports Of Texas Inc", customers.get(4532).getCompany());
	}

	@Test
	@DisplayName("Record 4533: Address is 2695 Villa Creek Dr")
	void AddressOfRecord4533() {
		assertEquals("2695 Villa Creek Dr", customers.get(4532).getAddress());
	}

	@Test
	@DisplayName("Record 4533: City is Dallas")
	void CityOfRecord4533() {
		assertEquals("Dallas", customers.get(4532).getCity());
	}

	@Test
	@DisplayName("Record 4533: County is Dallas")
	void CountyOfRecord4533() {
		assertEquals("Dallas", customers.get(4532).getCounty());
	}

	@Test
	@DisplayName("Record 4533: State is TX")
	void StateOfRecord4533() {
		assertEquals("TX", customers.get(4532).getState());
	}

	@Test
	@DisplayName("Record 4533: ZIP is 75234")
	void ZIPOfRecord4533() {
		assertEquals("75234", customers.get(4532).getZIP());
	}

	@Test
	@DisplayName("Record 4533: Phone is 972-247-8765")
	void PhoneOfRecord4533() {
		assertEquals("972-247-8765", customers.get(4532).getPhone());
	}

	@Test
	@DisplayName("Record 4533: Fax is 972-247-4699")
	void FaxOfRecord4533() {
		assertEquals("972-247-4699", customers.get(4532).getFax());
	}

	@Test
	@DisplayName("Record 4533: Email is jill@mckeel.com")
	void EmailOfRecord4533() {
		assertEquals("jill@mckeel.com", customers.get(4532).getEmail());
	}

	@Test
	@DisplayName("Record 4533: Web is http://www.jillmckeel.com")
	void WebOfRecord4533() {
		assertEquals("http://www.jillmckeel.com", customers.get(4532).getWeb());
	}
}
