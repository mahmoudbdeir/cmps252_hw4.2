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

@Tag("12")
class Record_713 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 713: FirstName is Ruben")
	void FirstNameOfRecord713() {
		assertEquals("Ruben", customers.get(712).getFirstName());
	}

	@Test
	@DisplayName("Record 713: LastName is Cathie")
	void LastNameOfRecord713() {
		assertEquals("Cathie", customers.get(712).getLastName());
	}

	@Test
	@DisplayName("Record 713: Company is Fair & Associates")
	void CompanyOfRecord713() {
		assertEquals("Fair & Associates", customers.get(712).getCompany());
	}

	@Test
	@DisplayName("Record 713: Address is 1523 S Stanford Way")
	void AddressOfRecord713() {
		assertEquals("1523 S Stanford Way", customers.get(712).getAddress());
	}

	@Test
	@DisplayName("Record 713: City is Sparks")
	void CityOfRecord713() {
		assertEquals("Sparks", customers.get(712).getCity());
	}

	@Test
	@DisplayName("Record 713: County is Washoe")
	void CountyOfRecord713() {
		assertEquals("Washoe", customers.get(712).getCounty());
	}

	@Test
	@DisplayName("Record 713: State is NV")
	void StateOfRecord713() {
		assertEquals("NV", customers.get(712).getState());
	}

	@Test
	@DisplayName("Record 713: ZIP is 89431")
	void ZIPOfRecord713() {
		assertEquals("89431", customers.get(712).getZIP());
	}

	@Test
	@DisplayName("Record 713: Phone is 775-358-5356")
	void PhoneOfRecord713() {
		assertEquals("775-358-5356", customers.get(712).getPhone());
	}

	@Test
	@DisplayName("Record 713: Fax is 775-358-0781")
	void FaxOfRecord713() {
		assertEquals("775-358-0781", customers.get(712).getFax());
	}

	@Test
	@DisplayName("Record 713: Email is ruben@cathie.com")
	void EmailOfRecord713() {
		assertEquals("ruben@cathie.com", customers.get(712).getEmail());
	}

	@Test
	@DisplayName("Record 713: Web is http://www.rubencathie.com")
	void WebOfRecord713() {
		assertEquals("http://www.rubencathie.com", customers.get(712).getWeb());
	}
}
