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

@Tag("2")
class Record_2307 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2307: FirstName is Neville")
	void FirstNameOfRecord2307() {
		assertEquals("Neville", customers.get(2306).getFirstName());
	}

	@Test
	@DisplayName("Record 2307: LastName is Sybel")
	void LastNameOfRecord2307() {
		assertEquals("Sybel", customers.get(2306).getLastName());
	}

	@Test
	@DisplayName("Record 2307: Company is Tileways Inc")
	void CompanyOfRecord2307() {
		assertEquals("Tileways Inc", customers.get(2306).getCompany());
	}

	@Test
	@DisplayName("Record 2307: Address is 30 E Exchange St")
	void AddressOfRecord2307() {
		assertEquals("30 E Exchange St", customers.get(2306).getAddress());
	}

	@Test
	@DisplayName("Record 2307: City is Akron")
	void CityOfRecord2307() {
		assertEquals("Akron", customers.get(2306).getCity());
	}

	@Test
	@DisplayName("Record 2307: County is Summit")
	void CountyOfRecord2307() {
		assertEquals("Summit", customers.get(2306).getCounty());
	}

	@Test
	@DisplayName("Record 2307: State is OH")
	void StateOfRecord2307() {
		assertEquals("OH", customers.get(2306).getState());
	}

	@Test
	@DisplayName("Record 2307: ZIP is 44308")
	void ZIPOfRecord2307() {
		assertEquals("44308", customers.get(2306).getZIP());
	}

	@Test
	@DisplayName("Record 2307: Phone is 330-376-3912")
	void PhoneOfRecord2307() {
		assertEquals("330-376-3912", customers.get(2306).getPhone());
	}

	@Test
	@DisplayName("Record 2307: Fax is 330-376-8772")
	void FaxOfRecord2307() {
		assertEquals("330-376-8772", customers.get(2306).getFax());
	}

	@Test
	@DisplayName("Record 2307: Email is neville@sybel.com")
	void EmailOfRecord2307() {
		assertEquals("neville@sybel.com", customers.get(2306).getEmail());
	}

	@Test
	@DisplayName("Record 2307: Web is http://www.nevillesybel.com")
	void WebOfRecord2307() {
		assertEquals("http://www.nevillesybel.com", customers.get(2306).getWeb());
	}
}
