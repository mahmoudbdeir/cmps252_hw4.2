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

@Tag("45")
class Record_4900 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4900: FirstName is Gilda")
	void FirstNameOfRecord4900() {
		assertEquals("Gilda", customers.get(4899).getFirstName());
	}

	@Test
	@DisplayName("Record 4900: LastName is Pattyre")
	void LastNameOfRecord4900() {
		assertEquals("Pattyre", customers.get(4899).getLastName());
	}

	@Test
	@DisplayName("Record 4900: Company is Twin Laboratories Inc")
	void CompanyOfRecord4900() {
		assertEquals("Twin Laboratories Inc", customers.get(4899).getCompany());
	}

	@Test
	@DisplayName("Record 4900: Address is 7222 Commerce Center Dr  #-2")
	void AddressOfRecord4900() {
		assertEquals("7222 Commerce Center Dr  #-2", customers.get(4899).getAddress());
	}

	@Test
	@DisplayName("Record 4900: City is Colorado Springs")
	void CityOfRecord4900() {
		assertEquals("Colorado Springs", customers.get(4899).getCity());
	}

	@Test
	@DisplayName("Record 4900: County is El Paso")
	void CountyOfRecord4900() {
		assertEquals("El Paso", customers.get(4899).getCounty());
	}

	@Test
	@DisplayName("Record 4900: State is CO")
	void StateOfRecord4900() {
		assertEquals("CO", customers.get(4899).getState());
	}

	@Test
	@DisplayName("Record 4900: ZIP is 80919")
	void ZIPOfRecord4900() {
		assertEquals("80919", customers.get(4899).getZIP());
	}

	@Test
	@DisplayName("Record 4900: Phone is 719-260-1131")
	void PhoneOfRecord4900() {
		assertEquals("719-260-1131", customers.get(4899).getPhone());
	}

	@Test
	@DisplayName("Record 4900: Fax is 719-260-1489")
	void FaxOfRecord4900() {
		assertEquals("719-260-1489", customers.get(4899).getFax());
	}

	@Test
	@DisplayName("Record 4900: Email is gilda@pattyre.com")
	void EmailOfRecord4900() {
		assertEquals("gilda@pattyre.com", customers.get(4899).getEmail());
	}

	@Test
	@DisplayName("Record 4900: Web is http://www.gildapattyre.com")
	void WebOfRecord4900() {
		assertEquals("http://www.gildapattyre.com", customers.get(4899).getWeb());
	}
}
