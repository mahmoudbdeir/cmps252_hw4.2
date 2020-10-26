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
class Record_2023 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2023: FirstName is Lauretta")
	void FirstNameOfRecord2023() {
		assertEquals("Lauretta", customers.get(2022).getFirstName());
	}

	@Test
	@DisplayName("Record 2023: LastName is Halim")
	void LastNameOfRecord2023() {
		assertEquals("Halim", customers.get(2022).getLastName());
	}

	@Test
	@DisplayName("Record 2023: Company is Dukes, John K Jr")
	void CompanyOfRecord2023() {
		assertEquals("Dukes, John K Jr", customers.get(2022).getCompany());
	}

	@Test
	@DisplayName("Record 2023: Address is 97 Seneca Rd")
	void AddressOfRecord2023() {
		assertEquals("97 Seneca Rd", customers.get(2022).getAddress());
	}

	@Test
	@DisplayName("Record 2023: City is New Haven")
	void CityOfRecord2023() {
		assertEquals("New Haven", customers.get(2022).getCity());
	}

	@Test
	@DisplayName("Record 2023: County is New Haven")
	void CountyOfRecord2023() {
		assertEquals("New Haven", customers.get(2022).getCounty());
	}

	@Test
	@DisplayName("Record 2023: State is CT")
	void StateOfRecord2023() {
		assertEquals("CT", customers.get(2022).getState());
	}

	@Test
	@DisplayName("Record 2023: ZIP is 6515")
	void ZIPOfRecord2023() {
		assertEquals("6515", customers.get(2022).getZIP());
	}

	@Test
	@DisplayName("Record 2023: Phone is 203-389-7496")
	void PhoneOfRecord2023() {
		assertEquals("203-389-7496", customers.get(2022).getPhone());
	}

	@Test
	@DisplayName("Record 2023: Fax is 203-389-0892")
	void FaxOfRecord2023() {
		assertEquals("203-389-0892", customers.get(2022).getFax());
	}

	@Test
	@DisplayName("Record 2023: Email is lauretta@halim.com")
	void EmailOfRecord2023() {
		assertEquals("lauretta@halim.com", customers.get(2022).getEmail());
	}

	@Test
	@DisplayName("Record 2023: Web is http://www.laurettahalim.com")
	void WebOfRecord2023() {
		assertEquals("http://www.laurettahalim.com", customers.get(2022).getWeb());
	}
}
