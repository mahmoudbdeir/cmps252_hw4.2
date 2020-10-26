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

@Tag("3")
class Record_4822 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4822: FirstName is Dion")
	void FirstNameOfRecord4822() {
		assertEquals("Dion", customers.get(4821).getFirstName());
	}

	@Test
	@DisplayName("Record 4822: LastName is Koblick")
	void LastNameOfRecord4822() {
		assertEquals("Koblick", customers.get(4821).getLastName());
	}

	@Test
	@DisplayName("Record 4822: Company is Anderson Associates Inc")
	void CompanyOfRecord4822() {
		assertEquals("Anderson Associates Inc", customers.get(4821).getCompany());
	}

	@Test
	@DisplayName("Record 4822: Address is 1 Main St")
	void AddressOfRecord4822() {
		assertEquals("1 Main St", customers.get(4821).getAddress());
	}

	@Test
	@DisplayName("Record 4822: City is Whitinsville")
	void CityOfRecord4822() {
		assertEquals("Whitinsville", customers.get(4821).getCity());
	}

	@Test
	@DisplayName("Record 4822: County is Worcester")
	void CountyOfRecord4822() {
		assertEquals("Worcester", customers.get(4821).getCounty());
	}

	@Test
	@DisplayName("Record 4822: State is MA")
	void StateOfRecord4822() {
		assertEquals("MA", customers.get(4821).getState());
	}

	@Test
	@DisplayName("Record 4822: ZIP is 1588")
	void ZIPOfRecord4822() {
		assertEquals("1588", customers.get(4821).getZIP());
	}

	@Test
	@DisplayName("Record 4822: Phone is 508-234-8654")
	void PhoneOfRecord4822() {
		assertEquals("508-234-8654", customers.get(4821).getPhone());
	}

	@Test
	@DisplayName("Record 4822: Fax is 508-234-8921")
	void FaxOfRecord4822() {
		assertEquals("508-234-8921", customers.get(4821).getFax());
	}

	@Test
	@DisplayName("Record 4822: Email is dion@koblick.com")
	void EmailOfRecord4822() {
		assertEquals("dion@koblick.com", customers.get(4821).getEmail());
	}

	@Test
	@DisplayName("Record 4822: Web is http://www.dionkoblick.com")
	void WebOfRecord4822() {
		assertEquals("http://www.dionkoblick.com", customers.get(4821).getWeb());
	}
}
