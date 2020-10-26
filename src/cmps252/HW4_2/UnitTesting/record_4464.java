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

@Tag("25")
class Record_4464 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4464: FirstName is Andrew")
	void FirstNameOfRecord4464() {
		assertEquals("Andrew", customers.get(4463).getFirstName());
	}

	@Test
	@DisplayName("Record 4464: LastName is Argenziano")
	void LastNameOfRecord4464() {
		assertEquals("Argenziano", customers.get(4463).getLastName());
	}

	@Test
	@DisplayName("Record 4464: Company is Corestates First Pa Bnk")
	void CompanyOfRecord4464() {
		assertEquals("Corestates First Pa Bnk", customers.get(4463).getCompany());
	}

	@Test
	@DisplayName("Record 4464: Address is 11700 Old Columbia Pike  #-113")
	void AddressOfRecord4464() {
		assertEquals("11700 Old Columbia Pike  #-113", customers.get(4463).getAddress());
	}

	@Test
	@DisplayName("Record 4464: City is Silver Spring")
	void CityOfRecord4464() {
		assertEquals("Silver Spring", customers.get(4463).getCity());
	}

	@Test
	@DisplayName("Record 4464: County is Montgomery")
	void CountyOfRecord4464() {
		assertEquals("Montgomery", customers.get(4463).getCounty());
	}

	@Test
	@DisplayName("Record 4464: State is MD")
	void StateOfRecord4464() {
		assertEquals("MD", customers.get(4463).getState());
	}

	@Test
	@DisplayName("Record 4464: ZIP is 20904")
	void ZIPOfRecord4464() {
		assertEquals("20904", customers.get(4463).getZIP());
	}

	@Test
	@DisplayName("Record 4464: Phone is 301-747-7928")
	void PhoneOfRecord4464() {
		assertEquals("301-747-7928", customers.get(4463).getPhone());
	}

	@Test
	@DisplayName("Record 4464: Fax is 301-747-3791")
	void FaxOfRecord4464() {
		assertEquals("301-747-3791", customers.get(4463).getFax());
	}

	@Test
	@DisplayName("Record 4464: Email is andrew@argenziano.com")
	void EmailOfRecord4464() {
		assertEquals("andrew@argenziano.com", customers.get(4463).getEmail());
	}

	@Test
	@DisplayName("Record 4464: Web is http://www.andrewargenziano.com")
	void WebOfRecord4464() {
		assertEquals("http://www.andrewargenziano.com", customers.get(4463).getWeb());
	}
}
