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

@Tag("29")
class Record_2486 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2486: FirstName is Karen")
	void FirstNameOfRecord2486() {
		assertEquals("Karen", customers.get(2485).getFirstName());
	}

	@Test
	@DisplayName("Record 2486: LastName is Michelet")
	void LastNameOfRecord2486() {
		assertEquals("Michelet", customers.get(2485).getLastName());
	}

	@Test
	@DisplayName("Record 2486: Company is Gaw Van Male Smith Myers")
	void CompanyOfRecord2486() {
		assertEquals("Gaw Van Male Smith Myers", customers.get(2485).getCompany());
	}

	@Test
	@DisplayName("Record 2486: Address is 231 Mount Hermon Rd")
	void AddressOfRecord2486() {
		assertEquals("231 Mount Hermon Rd", customers.get(2485).getAddress());
	}

	@Test
	@DisplayName("Record 2486: City is Scotts Valley")
	void CityOfRecord2486() {
		assertEquals("Scotts Valley", customers.get(2485).getCity());
	}

	@Test
	@DisplayName("Record 2486: County is Santa Cruz")
	void CountyOfRecord2486() {
		assertEquals("Santa Cruz", customers.get(2485).getCounty());
	}

	@Test
	@DisplayName("Record 2486: State is CA")
	void StateOfRecord2486() {
		assertEquals("CA", customers.get(2485).getState());
	}

	@Test
	@DisplayName("Record 2486: ZIP is 95066")
	void ZIPOfRecord2486() {
		assertEquals("95066", customers.get(2485).getZIP());
	}

	@Test
	@DisplayName("Record 2486: Phone is 831-438-8931")
	void PhoneOfRecord2486() {
		assertEquals("831-438-8931", customers.get(2485).getPhone());
	}

	@Test
	@DisplayName("Record 2486: Fax is 831-438-5448")
	void FaxOfRecord2486() {
		assertEquals("831-438-5448", customers.get(2485).getFax());
	}

	@Test
	@DisplayName("Record 2486: Email is karen@michelet.com")
	void EmailOfRecord2486() {
		assertEquals("karen@michelet.com", customers.get(2485).getEmail());
	}

	@Test
	@DisplayName("Record 2486: Web is http://www.karenmichelet.com")
	void WebOfRecord2486() {
		assertEquals("http://www.karenmichelet.com", customers.get(2485).getWeb());
	}
}
