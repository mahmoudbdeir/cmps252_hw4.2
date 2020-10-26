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

@Tag("3")
class Record_4235 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4235: FirstName is Jerrod")
	void FirstNameOfRecord4235() {
		assertEquals("Jerrod", customers.get(4234).getFirstName());
	}

	@Test
	@DisplayName("Record 4235: LastName is Tinnerello")
	void LastNameOfRecord4235() {
		assertEquals("Tinnerello", customers.get(4234).getLastName());
	}

	@Test
	@DisplayName("Record 4235: Company is Kalispell Neon")
	void CompanyOfRecord4235() {
		assertEquals("Kalispell Neon", customers.get(4234).getCompany());
	}

	@Test
	@DisplayName("Record 4235: Address is 193 S State Rt 17")
	void AddressOfRecord4235() {
		assertEquals("193 S State Rt 17", customers.get(4234).getAddress());
	}

	@Test
	@DisplayName("Record 4235: City is Paramus")
	void CityOfRecord4235() {
		assertEquals("Paramus", customers.get(4234).getCity());
	}

	@Test
	@DisplayName("Record 4235: County is Bergen")
	void CountyOfRecord4235() {
		assertEquals("Bergen", customers.get(4234).getCounty());
	}

	@Test
	@DisplayName("Record 4235: State is NJ")
	void StateOfRecord4235() {
		assertEquals("NJ", customers.get(4234).getState());
	}

	@Test
	@DisplayName("Record 4235: ZIP is 7652")
	void ZIPOfRecord4235() {
		assertEquals("7652", customers.get(4234).getZIP());
	}

	@Test
	@DisplayName("Record 4235: Phone is 201-967-6643")
	void PhoneOfRecord4235() {
		assertEquals("201-967-6643", customers.get(4234).getPhone());
	}

	@Test
	@DisplayName("Record 4235: Fax is 201-967-9824")
	void FaxOfRecord4235() {
		assertEquals("201-967-9824", customers.get(4234).getFax());
	}

	@Test
	@DisplayName("Record 4235: Email is jerrod@tinnerello.com")
	void EmailOfRecord4235() {
		assertEquals("jerrod@tinnerello.com", customers.get(4234).getEmail());
	}

	@Test
	@DisplayName("Record 4235: Web is http://www.jerrodtinnerello.com")
	void WebOfRecord4235() {
		assertEquals("http://www.jerrodtinnerello.com", customers.get(4234).getWeb());
	}
}
