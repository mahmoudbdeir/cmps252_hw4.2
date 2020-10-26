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

@Tag("49")
class Record_261 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 261: FirstName is Paulette")
	void FirstNameOfRecord261() {
		assertEquals("Paulette", customers.get(260).getFirstName());
	}

	@Test
	@DisplayName("Record 261: LastName is Lagonia")
	void LastNameOfRecord261() {
		assertEquals("Lagonia", customers.get(260).getLastName());
	}

	@Test
	@DisplayName("Record 261: Company is Ontic Engineering Mfg")
	void CompanyOfRecord261() {
		assertEquals("Ontic Engineering Mfg", customers.get(260).getCompany());
	}

	@Test
	@DisplayName("Record 261: Address is 500 William St")
	void AddressOfRecord261() {
		assertEquals("500 William St", customers.get(260).getAddress());
	}

	@Test
	@DisplayName("Record 261: City is Pen Argyl")
	void CityOfRecord261() {
		assertEquals("Pen Argyl", customers.get(260).getCity());
	}

	@Test
	@DisplayName("Record 261: County is Northampton")
	void CountyOfRecord261() {
		assertEquals("Northampton", customers.get(260).getCounty());
	}

	@Test
	@DisplayName("Record 261: State is PA")
	void StateOfRecord261() {
		assertEquals("PA", customers.get(260).getState());
	}

	@Test
	@DisplayName("Record 261: ZIP is 18072")
	void ZIPOfRecord261() {
		assertEquals("18072", customers.get(260).getZIP());
	}

	@Test
	@DisplayName("Record 261: Phone is 610-863-9185")
	void PhoneOfRecord261() {
		assertEquals("610-863-9185", customers.get(260).getPhone());
	}

	@Test
	@DisplayName("Record 261: Fax is 610-863-9309")
	void FaxOfRecord261() {
		assertEquals("610-863-9309", customers.get(260).getFax());
	}

	@Test
	@DisplayName("Record 261: Email is paulette@lagonia.com")
	void EmailOfRecord261() {
		assertEquals("paulette@lagonia.com", customers.get(260).getEmail());
	}

	@Test
	@DisplayName("Record 261: Web is http://www.paulettelagonia.com")
	void WebOfRecord261() {
		assertEquals("http://www.paulettelagonia.com", customers.get(260).getWeb());
	}
}
