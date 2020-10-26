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

@Tag("24")
class Record_4388 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4388: FirstName is Gaylord")
	void FirstNameOfRecord4388() {
		assertEquals("Gaylord", customers.get(4387).getFirstName());
	}

	@Test
	@DisplayName("Record 4388: LastName is Bundette")
	void LastNameOfRecord4388() {
		assertEquals("Bundette", customers.get(4387).getLastName());
	}

	@Test
	@DisplayName("Record 4388: Company is Centurion Limousine")
	void CompanyOfRecord4388() {
		assertEquals("Centurion Limousine", customers.get(4387).getCompany());
	}

	@Test
	@DisplayName("Record 4388: Address is 605 Main St")
	void AddressOfRecord4388() {
		assertEquals("605 Main St", customers.get(4387).getAddress());
	}

	@Test
	@DisplayName("Record 4388: City is Hackensack")
	void CityOfRecord4388() {
		assertEquals("Hackensack", customers.get(4387).getCity());
	}

	@Test
	@DisplayName("Record 4388: County is Bergen")
	void CountyOfRecord4388() {
		assertEquals("Bergen", customers.get(4387).getCounty());
	}

	@Test
	@DisplayName("Record 4388: State is NJ")
	void StateOfRecord4388() {
		assertEquals("NJ", customers.get(4387).getState());
	}

	@Test
	@DisplayName("Record 4388: ZIP is 07601")
	void ZIPOfRecord4388() {
		assertEquals("07601", customers.get(4387).getZIP());
	}

	@Test
	@DisplayName("Record 4388: Phone is 201-488-8175")
	void PhoneOfRecord4388() {
		assertEquals("201-488-8175", customers.get(4387).getPhone());
	}

	@Test
	@DisplayName("Record 4388: Fax is 201-488-9995")
	void FaxOfRecord4388() {
		assertEquals("201-488-9995", customers.get(4387).getFax());
	}

	@Test
	@DisplayName("Record 4388: Email is gaylord@bundette.com")
	void EmailOfRecord4388() {
		assertEquals("gaylord@bundette.com", customers.get(4387).getEmail());
	}

	@Test
	@DisplayName("Record 4388: Web is http://www.gaylordbundette.com")
	void WebOfRecord4388() {
		assertEquals("http://www.gaylordbundette.com", customers.get(4387).getWeb());
	}
}
