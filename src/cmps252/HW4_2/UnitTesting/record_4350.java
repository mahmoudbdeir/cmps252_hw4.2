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

@Tag("27")
class Record_4350 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4350: FirstName is Christine")
	void FirstNameOfRecord4350() {
		assertEquals("Christine", customers.get(4349).getFirstName());
	}

	@Test
	@DisplayName("Record 4350: LastName is Moros")
	void LastNameOfRecord4350() {
		assertEquals("Moros", customers.get(4349).getLastName());
	}

	@Test
	@DisplayName("Record 4350: Company is Cablevision Of Shreveport")
	void CompanyOfRecord4350() {
		assertEquals("Cablevision Of Shreveport", customers.get(4349).getCompany());
	}

	@Test
	@DisplayName("Record 4350: Address is 4550 Montgomery Ave")
	void AddressOfRecord4350() {
		assertEquals("4550 Montgomery Ave", customers.get(4349).getAddress());
	}

	@Test
	@DisplayName("Record 4350: City is Bethesda")
	void CityOfRecord4350() {
		assertEquals("Bethesda", customers.get(4349).getCity());
	}

	@Test
	@DisplayName("Record 4350: County is Montgomery")
	void CountyOfRecord4350() {
		assertEquals("Montgomery", customers.get(4349).getCounty());
	}

	@Test
	@DisplayName("Record 4350: State is MD")
	void StateOfRecord4350() {
		assertEquals("MD", customers.get(4349).getState());
	}

	@Test
	@DisplayName("Record 4350: ZIP is 20814")
	void ZIPOfRecord4350() {
		assertEquals("20814", customers.get(4349).getZIP());
	}

	@Test
	@DisplayName("Record 4350: Phone is 301-951-0399")
	void PhoneOfRecord4350() {
		assertEquals("301-951-0399", customers.get(4349).getPhone());
	}

	@Test
	@DisplayName("Record 4350: Fax is 301-951-7508")
	void FaxOfRecord4350() {
		assertEquals("301-951-7508", customers.get(4349).getFax());
	}

	@Test
	@DisplayName("Record 4350: Email is christine@moros.com")
	void EmailOfRecord4350() {
		assertEquals("christine@moros.com", customers.get(4349).getEmail());
	}

	@Test
	@DisplayName("Record 4350: Web is http://www.christinemoros.com")
	void WebOfRecord4350() {
		assertEquals("http://www.christinemoros.com", customers.get(4349).getWeb());
	}
}
