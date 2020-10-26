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

@Tag("14")
class Record_2866 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2866: FirstName is Gayle")
	void FirstNameOfRecord2866() {
		assertEquals("Gayle", customers.get(2865).getFirstName());
	}

	@Test
	@DisplayName("Record 2866: LastName is Hundt")
	void LastNameOfRecord2866() {
		assertEquals("Hundt", customers.get(2865).getLastName());
	}

	@Test
	@DisplayName("Record 2866: Company is Ames Supply Co")
	void CompanyOfRecord2866() {
		assertEquals("Ames Supply Co", customers.get(2865).getCompany());
	}

	@Test
	@DisplayName("Record 2866: Address is Johnston St")
	void AddressOfRecord2866() {
		assertEquals("Johnston St", customers.get(2865).getAddress());
	}

	@Test
	@DisplayName("Record 2866: City is Lafayette")
	void CityOfRecord2866() {
		assertEquals("Lafayette", customers.get(2865).getCity());
	}

	@Test
	@DisplayName("Record 2866: County is Lafayette")
	void CountyOfRecord2866() {
		assertEquals("Lafayette", customers.get(2865).getCounty());
	}

	@Test
	@DisplayName("Record 2866: State is LA")
	void StateOfRecord2866() {
		assertEquals("LA", customers.get(2865).getState());
	}

	@Test
	@DisplayName("Record 2866: ZIP is 70509")
	void ZIPOfRecord2866() {
		assertEquals("70509", customers.get(2865).getZIP());
	}

	@Test
	@DisplayName("Record 2866: Phone is 337-988-9550")
	void PhoneOfRecord2866() {
		assertEquals("337-988-9550", customers.get(2865).getPhone());
	}

	@Test
	@DisplayName("Record 2866: Fax is 337-988-3196")
	void FaxOfRecord2866() {
		assertEquals("337-988-3196", customers.get(2865).getFax());
	}

	@Test
	@DisplayName("Record 2866: Email is gayle@hundt.com")
	void EmailOfRecord2866() {
		assertEquals("gayle@hundt.com", customers.get(2865).getEmail());
	}

	@Test
	@DisplayName("Record 2866: Web is http://www.gaylehundt.com")
	void WebOfRecord2866() {
		assertEquals("http://www.gaylehundt.com", customers.get(2865).getWeb());
	}
}
