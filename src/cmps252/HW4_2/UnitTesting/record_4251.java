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

@Tag("32")
class Record_4251 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4251: FirstName is Garret")
	void FirstNameOfRecord4251() {
		assertEquals("Garret", customers.get(4250).getFirstName());
	}

	@Test
	@DisplayName("Record 4251: LastName is Mollere")
	void LastNameOfRecord4251() {
		assertEquals("Mollere", customers.get(4250).getLastName());
	}

	@Test
	@DisplayName("Record 4251: Company is Ramada Htl Adria & Cnfrnc Ctr")
	void CompanyOfRecord4251() {
		assertEquals("Ramada Htl Adria & Cnfrnc Ctr", customers.get(4250).getCompany());
	}

	@Test
	@DisplayName("Record 4251: Address is 1640 E Flamingo Rd")
	void AddressOfRecord4251() {
		assertEquals("1640 E Flamingo Rd", customers.get(4250).getAddress());
	}

	@Test
	@DisplayName("Record 4251: City is Las Vegas")
	void CityOfRecord4251() {
		assertEquals("Las Vegas", customers.get(4250).getCity());
	}

	@Test
	@DisplayName("Record 4251: County is Clark")
	void CountyOfRecord4251() {
		assertEquals("Clark", customers.get(4250).getCounty());
	}

	@Test
	@DisplayName("Record 4251: State is NV")
	void StateOfRecord4251() {
		assertEquals("NV", customers.get(4250).getState());
	}

	@Test
	@DisplayName("Record 4251: ZIP is 89119")
	void ZIPOfRecord4251() {
		assertEquals("89119", customers.get(4250).getZIP());
	}

	@Test
	@DisplayName("Record 4251: Phone is 702-892-1568")
	void PhoneOfRecord4251() {
		assertEquals("702-892-1568", customers.get(4250).getPhone());
	}

	@Test
	@DisplayName("Record 4251: Fax is 702-892-9993")
	void FaxOfRecord4251() {
		assertEquals("702-892-9993", customers.get(4250).getFax());
	}

	@Test
	@DisplayName("Record 4251: Email is garret@mollere.com")
	void EmailOfRecord4251() {
		assertEquals("garret@mollere.com", customers.get(4250).getEmail());
	}

	@Test
	@DisplayName("Record 4251: Web is http://www.garretmollere.com")
	void WebOfRecord4251() {
		assertEquals("http://www.garretmollere.com", customers.get(4250).getWeb());
	}
}
