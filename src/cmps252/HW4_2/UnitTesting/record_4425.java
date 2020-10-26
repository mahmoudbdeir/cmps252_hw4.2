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
class Record_4425 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4425: FirstName is Luciano")
	void FirstNameOfRecord4425() {
		assertEquals("Luciano", customers.get(4424).getFirstName());
	}

	@Test
	@DisplayName("Record 4425: LastName is Legath")
	void LastNameOfRecord4425() {
		assertEquals("Legath", customers.get(4424).getLastName());
	}

	@Test
	@DisplayName("Record 4425: Company is Image Maker")
	void CompanyOfRecord4425() {
		assertEquals("Image Maker", customers.get(4424).getCompany());
	}

	@Test
	@DisplayName("Record 4425: Address is 525 Commerce Dr")
	void AddressOfRecord4425() {
		assertEquals("525 Commerce Dr", customers.get(4424).getAddress());
	}

	@Test
	@DisplayName("Record 4425: City is Upper Marlboro")
	void CityOfRecord4425() {
		assertEquals("Upper Marlboro", customers.get(4424).getCity());
	}

	@Test
	@DisplayName("Record 4425: County is Prince Georges")
	void CountyOfRecord4425() {
		assertEquals("Prince Georges", customers.get(4424).getCounty());
	}

	@Test
	@DisplayName("Record 4425: State is MD")
	void StateOfRecord4425() {
		assertEquals("MD", customers.get(4424).getState());
	}

	@Test
	@DisplayName("Record 4425: ZIP is 20772")
	void ZIPOfRecord4425() {
		assertEquals("20772", customers.get(4424).getZIP());
	}

	@Test
	@DisplayName("Record 4425: Phone is 301-736-1622")
	void PhoneOfRecord4425() {
		assertEquals("301-736-1622", customers.get(4424).getPhone());
	}

	@Test
	@DisplayName("Record 4425: Fax is 301-736-4136")
	void FaxOfRecord4425() {
		assertEquals("301-736-4136", customers.get(4424).getFax());
	}

	@Test
	@DisplayName("Record 4425: Email is luciano@legath.com")
	void EmailOfRecord4425() {
		assertEquals("luciano@legath.com", customers.get(4424).getEmail());
	}

	@Test
	@DisplayName("Record 4425: Web is http://www.lucianolegath.com")
	void WebOfRecord4425() {
		assertEquals("http://www.lucianolegath.com", customers.get(4424).getWeb());
	}
}
