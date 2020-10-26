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

@Tag("9")
class Record_4482 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4482: FirstName is Rogelio")
	void FirstNameOfRecord4482() {
		assertEquals("Rogelio", customers.get(4481).getFirstName());
	}

	@Test
	@DisplayName("Record 4482: LastName is Claassen")
	void LastNameOfRecord4482() {
		assertEquals("Claassen", customers.get(4481).getLastName());
	}

	@Test
	@DisplayName("Record 4482: Company is Rothery Surveying Inc")
	void CompanyOfRecord4482() {
		assertEquals("Rothery Surveying Inc", customers.get(4481).getCompany());
	}

	@Test
	@DisplayName("Record 4482: Address is 421 E Drinker St")
	void AddressOfRecord4482() {
		assertEquals("421 E Drinker St", customers.get(4481).getAddress());
	}

	@Test
	@DisplayName("Record 4482: City is Scranton")
	void CityOfRecord4482() {
		assertEquals("Scranton", customers.get(4481).getCity());
	}

	@Test
	@DisplayName("Record 4482: County is Lackawanna")
	void CountyOfRecord4482() {
		assertEquals("Lackawanna", customers.get(4481).getCounty());
	}

	@Test
	@DisplayName("Record 4482: State is PA")
	void StateOfRecord4482() {
		assertEquals("PA", customers.get(4481).getState());
	}

	@Test
	@DisplayName("Record 4482: ZIP is 18512")
	void ZIPOfRecord4482() {
		assertEquals("18512", customers.get(4481).getZIP());
	}

	@Test
	@DisplayName("Record 4482: Phone is 570-969-4783")
	void PhoneOfRecord4482() {
		assertEquals("570-969-4783", customers.get(4481).getPhone());
	}

	@Test
	@DisplayName("Record 4482: Fax is 570-969-4058")
	void FaxOfRecord4482() {
		assertEquals("570-969-4058", customers.get(4481).getFax());
	}

	@Test
	@DisplayName("Record 4482: Email is rogelio@claassen.com")
	void EmailOfRecord4482() {
		assertEquals("rogelio@claassen.com", customers.get(4481).getEmail());
	}

	@Test
	@DisplayName("Record 4482: Web is http://www.rogelioclaassen.com")
	void WebOfRecord4482() {
		assertEquals("http://www.rogelioclaassen.com", customers.get(4481).getWeb());
	}
}
