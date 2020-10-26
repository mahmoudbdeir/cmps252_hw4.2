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

@Tag("0")
class Record_3449 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3449: FirstName is Robbie")
	void FirstNameOfRecord3449() {
		assertEquals("Robbie", customers.get(3448).getFirstName());
	}

	@Test
	@DisplayName("Record 3449: LastName is Slowik")
	void LastNameOfRecord3449() {
		assertEquals("Slowik", customers.get(3448).getLastName());
	}

	@Test
	@DisplayName("Record 3449: Company is Linworth Publishing Inc")
	void CompanyOfRecord3449() {
		assertEquals("Linworth Publishing Inc", customers.get(3448).getCompany());
	}

	@Test
	@DisplayName("Record 3449: Address is 6154 Rockburn Hill Rd")
	void AddressOfRecord3449() {
		assertEquals("6154 Rockburn Hill Rd", customers.get(3448).getAddress());
	}

	@Test
	@DisplayName("Record 3449: City is Halethorpe")
	void CityOfRecord3449() {
		assertEquals("Halethorpe", customers.get(3448).getCity());
	}

	@Test
	@DisplayName("Record 3449: County is Baltimore")
	void CountyOfRecord3449() {
		assertEquals("Baltimore", customers.get(3448).getCounty());
	}

	@Test
	@DisplayName("Record 3449: State is MD")
	void StateOfRecord3449() {
		assertEquals("MD", customers.get(3448).getState());
	}

	@Test
	@DisplayName("Record 3449: ZIP is 21227")
	void ZIPOfRecord3449() {
		assertEquals("21227", customers.get(3448).getZIP());
	}

	@Test
	@DisplayName("Record 3449: Phone is 410-796-6349")
	void PhoneOfRecord3449() {
		assertEquals("410-796-6349", customers.get(3448).getPhone());
	}

	@Test
	@DisplayName("Record 3449: Fax is 410-796-8911")
	void FaxOfRecord3449() {
		assertEquals("410-796-8911", customers.get(3448).getFax());
	}

	@Test
	@DisplayName("Record 3449: Email is robbie@slowik.com")
	void EmailOfRecord3449() {
		assertEquals("robbie@slowik.com", customers.get(3448).getEmail());
	}

	@Test
	@DisplayName("Record 3449: Web is http://www.robbieslowik.com")
	void WebOfRecord3449() {
		assertEquals("http://www.robbieslowik.com", customers.get(3448).getWeb());
	}
}
