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

@Tag("37")
class Record_4162 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4162: FirstName is Lizzie")
	void FirstNameOfRecord4162() {
		assertEquals("Lizzie", customers.get(4161).getFirstName());
	}

	@Test
	@DisplayName("Record 4162: LastName is Fitserald")
	void LastNameOfRecord4162() {
		assertEquals("Fitserald", customers.get(4161).getLastName());
	}

	@Test
	@DisplayName("Record 4162: Company is Richardson & Richardson Drs")
	void CompanyOfRecord4162() {
		assertEquals("Richardson & Richardson Drs", customers.get(4161).getCompany());
	}

	@Test
	@DisplayName("Record 4162: Address is 11940 W Ripley Ave")
	void AddressOfRecord4162() {
		assertEquals("11940 W Ripley Ave", customers.get(4161).getAddress());
	}

	@Test
	@DisplayName("Record 4162: City is Milwaukee")
	void CityOfRecord4162() {
		assertEquals("Milwaukee", customers.get(4161).getCity());
	}

	@Test
	@DisplayName("Record 4162: County is Milwaukee")
	void CountyOfRecord4162() {
		assertEquals("Milwaukee", customers.get(4161).getCounty());
	}

	@Test
	@DisplayName("Record 4162: State is WI")
	void StateOfRecord4162() {
		assertEquals("WI", customers.get(4161).getState());
	}

	@Test
	@DisplayName("Record 4162: ZIP is 53226")
	void ZIPOfRecord4162() {
		assertEquals("53226", customers.get(4161).getZIP());
	}

	@Test
	@DisplayName("Record 4162: Phone is 414-257-5750")
	void PhoneOfRecord4162() {
		assertEquals("414-257-5750", customers.get(4161).getPhone());
	}

	@Test
	@DisplayName("Record 4162: Fax is 414-257-0053")
	void FaxOfRecord4162() {
		assertEquals("414-257-0053", customers.get(4161).getFax());
	}

	@Test
	@DisplayName("Record 4162: Email is lizzie@fitserald.com")
	void EmailOfRecord4162() {
		assertEquals("lizzie@fitserald.com", customers.get(4161).getEmail());
	}

	@Test
	@DisplayName("Record 4162: Web is http://www.lizziefitserald.com")
	void WebOfRecord4162() {
		assertEquals("http://www.lizziefitserald.com", customers.get(4161).getWeb());
	}
}
