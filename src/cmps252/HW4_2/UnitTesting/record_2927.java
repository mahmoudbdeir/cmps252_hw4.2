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
class Record_2927 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2927: FirstName is Elijah")
	void FirstNameOfRecord2927() {
		assertEquals("Elijah", customers.get(2926).getFirstName());
	}

	@Test
	@DisplayName("Record 2927: LastName is Rittenour")
	void LastNameOfRecord2927() {
		assertEquals("Rittenour", customers.get(2926).getLastName());
	}

	@Test
	@DisplayName("Record 2927: Company is Jack Nahon Import Corp")
	void CompanyOfRecord2927() {
		assertEquals("Jack Nahon Import Corp", customers.get(2926).getCompany());
	}

	@Test
	@DisplayName("Record 2927: Address is 4901 Pulaski Hwy")
	void AddressOfRecord2927() {
		assertEquals("4901 Pulaski Hwy", customers.get(2926).getAddress());
	}

	@Test
	@DisplayName("Record 2927: City is Baltimore")
	void CityOfRecord2927() {
		assertEquals("Baltimore", customers.get(2926).getCity());
	}

	@Test
	@DisplayName("Record 2927: County is Baltimore City")
	void CountyOfRecord2927() {
		assertEquals("Baltimore City", customers.get(2926).getCounty());
	}

	@Test
	@DisplayName("Record 2927: State is MD")
	void StateOfRecord2927() {
		assertEquals("MD", customers.get(2926).getState());
	}

	@Test
	@DisplayName("Record 2927: ZIP is 21224")
	void ZIPOfRecord2927() {
		assertEquals("21224", customers.get(2926).getZIP());
	}

	@Test
	@DisplayName("Record 2927: Phone is 410-675-1465")
	void PhoneOfRecord2927() {
		assertEquals("410-675-1465", customers.get(2926).getPhone());
	}

	@Test
	@DisplayName("Record 2927: Fax is 410-675-3365")
	void FaxOfRecord2927() {
		assertEquals("410-675-3365", customers.get(2926).getFax());
	}

	@Test
	@DisplayName("Record 2927: Email is elijah@rittenour.com")
	void EmailOfRecord2927() {
		assertEquals("elijah@rittenour.com", customers.get(2926).getEmail());
	}

	@Test
	@DisplayName("Record 2927: Web is http://www.elijahrittenour.com")
	void WebOfRecord2927() {
		assertEquals("http://www.elijahrittenour.com", customers.get(2926).getWeb());
	}
}
