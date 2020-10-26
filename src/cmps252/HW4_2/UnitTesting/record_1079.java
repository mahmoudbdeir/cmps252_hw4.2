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

@Tag("20")
class Record_1079 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1079: FirstName is Jamel")
	void FirstNameOfRecord1079() {
		assertEquals("Jamel", customers.get(1078).getFirstName());
	}

	@Test
	@DisplayName("Record 1079: LastName is Treff")
	void LastNameOfRecord1079() {
		assertEquals("Treff", customers.get(1078).getLastName());
	}

	@Test
	@DisplayName("Record 1079: Company is Covers Co")
	void CompanyOfRecord1079() {
		assertEquals("Covers Co", customers.get(1078).getCompany());
	}

	@Test
	@DisplayName("Record 1079: Address is 612 Peters Rd")
	void AddressOfRecord1079() {
		assertEquals("612 Peters Rd", customers.get(1078).getAddress());
	}

	@Test
	@DisplayName("Record 1079: City is Harvey")
	void CityOfRecord1079() {
		assertEquals("Harvey", customers.get(1078).getCity());
	}

	@Test
	@DisplayName("Record 1079: County is Jefferson")
	void CountyOfRecord1079() {
		assertEquals("Jefferson", customers.get(1078).getCounty());
	}

	@Test
	@DisplayName("Record 1079: State is LA")
	void StateOfRecord1079() {
		assertEquals("LA", customers.get(1078).getState());
	}

	@Test
	@DisplayName("Record 1079: ZIP is 70058")
	void ZIPOfRecord1079() {
		assertEquals("70058", customers.get(1078).getZIP());
	}

	@Test
	@DisplayName("Record 1079: Phone is 504-366-1320")
	void PhoneOfRecord1079() {
		assertEquals("504-366-1320", customers.get(1078).getPhone());
	}

	@Test
	@DisplayName("Record 1079: Fax is 504-366-6573")
	void FaxOfRecord1079() {
		assertEquals("504-366-6573", customers.get(1078).getFax());
	}

	@Test
	@DisplayName("Record 1079: Email is jamel@treff.com")
	void EmailOfRecord1079() {
		assertEquals("jamel@treff.com", customers.get(1078).getEmail());
	}

	@Test
	@DisplayName("Record 1079: Web is http://www.jameltreff.com")
	void WebOfRecord1079() {
		assertEquals("http://www.jameltreff.com", customers.get(1078).getWeb());
	}
}
