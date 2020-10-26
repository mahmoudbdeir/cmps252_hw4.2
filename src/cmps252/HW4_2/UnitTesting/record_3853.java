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

@Tag("36")
class Record_3853 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3853: FirstName is Robbie")
	void FirstNameOfRecord3853() {
		assertEquals("Robbie", customers.get(3852).getFirstName());
	}

	@Test
	@DisplayName("Record 3853: LastName is Riexinger")
	void LastNameOfRecord3853() {
		assertEquals("Riexinger", customers.get(3852).getLastName());
	}

	@Test
	@DisplayName("Record 3853: Company is Leveleg Mounting Hardware")
	void CompanyOfRecord3853() {
		assertEquals("Leveleg Mounting Hardware", customers.get(3852).getCompany());
	}

	@Test
	@DisplayName("Record 3853: Address is 2 Hopkins Plz")
	void AddressOfRecord3853() {
		assertEquals("2 Hopkins Plz", customers.get(3852).getAddress());
	}

	@Test
	@DisplayName("Record 3853: City is Baltimore")
	void CityOfRecord3853() {
		assertEquals("Baltimore", customers.get(3852).getCity());
	}

	@Test
	@DisplayName("Record 3853: County is Baltimore City")
	void CountyOfRecord3853() {
		assertEquals("Baltimore City", customers.get(3852).getCounty());
	}

	@Test
	@DisplayName("Record 3853: State is MD")
	void StateOfRecord3853() {
		assertEquals("MD", customers.get(3852).getState());
	}

	@Test
	@DisplayName("Record 3853: ZIP is 21201")
	void ZIPOfRecord3853() {
		assertEquals("21201", customers.get(3852).getZIP());
	}

	@Test
	@DisplayName("Record 3853: Phone is 410-837-9091")
	void PhoneOfRecord3853() {
		assertEquals("410-837-9091", customers.get(3852).getPhone());
	}

	@Test
	@DisplayName("Record 3853: Fax is 410-837-1208")
	void FaxOfRecord3853() {
		assertEquals("410-837-1208", customers.get(3852).getFax());
	}

	@Test
	@DisplayName("Record 3853: Email is robbie@riexinger.com")
	void EmailOfRecord3853() {
		assertEquals("robbie@riexinger.com", customers.get(3852).getEmail());
	}

	@Test
	@DisplayName("Record 3853: Web is http://www.robbieriexinger.com")
	void WebOfRecord3853() {
		assertEquals("http://www.robbieriexinger.com", customers.get(3852).getWeb());
	}
}
