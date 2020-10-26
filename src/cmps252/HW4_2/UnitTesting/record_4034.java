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
class Record_4034 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4034: FirstName is Norman")
	void FirstNameOfRecord4034() {
		assertEquals("Norman", customers.get(4033).getFirstName());
	}

	@Test
	@DisplayName("Record 4034: LastName is Wheeless")
	void LastNameOfRecord4034() {
		assertEquals("Wheeless", customers.get(4033).getLastName());
	}

	@Test
	@DisplayName("Record 4034: Company is Schnittman, Michael S Esq")
	void CompanyOfRecord4034() {
		assertEquals("Schnittman, Michael S Esq", customers.get(4033).getCompany());
	}

	@Test
	@DisplayName("Record 4034: Address is 1424 State Rt 23")
	void AddressOfRecord4034() {
		assertEquals("1424 State Rt 23", customers.get(4033).getAddress());
	}

	@Test
	@DisplayName("Record 4034: City is Butler")
	void CityOfRecord4034() {
		assertEquals("Butler", customers.get(4033).getCity());
	}

	@Test
	@DisplayName("Record 4034: County is Morris")
	void CountyOfRecord4034() {
		assertEquals("Morris", customers.get(4033).getCounty());
	}

	@Test
	@DisplayName("Record 4034: State is NJ")
	void StateOfRecord4034() {
		assertEquals("NJ", customers.get(4033).getState());
	}

	@Test
	@DisplayName("Record 4034: ZIP is 7405")
	void ZIPOfRecord4034() {
		assertEquals("7405", customers.get(4033).getZIP());
	}

	@Test
	@DisplayName("Record 4034: Phone is 973-838-8647")
	void PhoneOfRecord4034() {
		assertEquals("973-838-8647", customers.get(4033).getPhone());
	}

	@Test
	@DisplayName("Record 4034: Fax is 973-838-6774")
	void FaxOfRecord4034() {
		assertEquals("973-838-6774", customers.get(4033).getFax());
	}

	@Test
	@DisplayName("Record 4034: Email is norman@wheeless.com")
	void EmailOfRecord4034() {
		assertEquals("norman@wheeless.com", customers.get(4033).getEmail());
	}

	@Test
	@DisplayName("Record 4034: Web is http://www.normanwheeless.com")
	void WebOfRecord4034() {
		assertEquals("http://www.normanwheeless.com", customers.get(4033).getWeb());
	}
}
