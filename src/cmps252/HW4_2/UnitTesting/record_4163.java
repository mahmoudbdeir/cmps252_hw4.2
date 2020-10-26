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
class Record_4163 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4163: FirstName is Lorene")
	void FirstNameOfRecord4163() {
		assertEquals("Lorene", customers.get(4162).getFirstName());
	}

	@Test
	@DisplayName("Record 4163: LastName is Mcklveen")
	void LastNameOfRecord4163() {
		assertEquals("Mcklveen", customers.get(4162).getLastName());
	}

	@Test
	@DisplayName("Record 4163: Company is Hamilton Printg & Ofc Supl Co")
	void CompanyOfRecord4163() {
		assertEquals("Hamilton Printg & Ofc Supl Co", customers.get(4162).getCompany());
	}

	@Test
	@DisplayName("Record 4163: Address is 5300 S Eastern Ave")
	void AddressOfRecord4163() {
		assertEquals("5300 S Eastern Ave", customers.get(4162).getAddress());
	}

	@Test
	@DisplayName("Record 4163: City is Los Angeles")
	void CityOfRecord4163() {
		assertEquals("Los Angeles", customers.get(4162).getCity());
	}

	@Test
	@DisplayName("Record 4163: County is Los Angeles")
	void CountyOfRecord4163() {
		assertEquals("Los Angeles", customers.get(4162).getCounty());
	}

	@Test
	@DisplayName("Record 4163: State is CA")
	void StateOfRecord4163() {
		assertEquals("CA", customers.get(4162).getState());
	}

	@Test
	@DisplayName("Record 4163: ZIP is 90040")
	void ZIPOfRecord4163() {
		assertEquals("90040", customers.get(4162).getZIP());
	}

	@Test
	@DisplayName("Record 4163: Phone is 323-724-5754")
	void PhoneOfRecord4163() {
		assertEquals("323-724-5754", customers.get(4162).getPhone());
	}

	@Test
	@DisplayName("Record 4163: Fax is 323-724-3335")
	void FaxOfRecord4163() {
		assertEquals("323-724-3335", customers.get(4162).getFax());
	}

	@Test
	@DisplayName("Record 4163: Email is lorene@mcklveen.com")
	void EmailOfRecord4163() {
		assertEquals("lorene@mcklveen.com", customers.get(4162).getEmail());
	}

	@Test
	@DisplayName("Record 4163: Web is http://www.lorenemcklveen.com")
	void WebOfRecord4163() {
		assertEquals("http://www.lorenemcklveen.com", customers.get(4162).getWeb());
	}
}
