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

@Tag("22")
class Record_3588 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3588: FirstName is Chet")
	void FirstNameOfRecord3588() {
		assertEquals("Chet", customers.get(3587).getFirstName());
	}

	@Test
	@DisplayName("Record 3588: LastName is Mccluney")
	void LastNameOfRecord3588() {
		assertEquals("Mccluney", customers.get(3587).getLastName());
	}

	@Test
	@DisplayName("Record 3588: Company is Liberty Carton Co")
	void CompanyOfRecord3588() {
		assertEquals("Liberty Carton Co", customers.get(3587).getCompany());
	}

	@Test
	@DisplayName("Record 3588: Address is 109 Mcnyll Rd")
	void AddressOfRecord3588() {
		assertEquals("109 Mcnyll Rd", customers.get(3587).getAddress());
	}

	@Test
	@DisplayName("Record 3588: City is Sanford")
	void CityOfRecord3588() {
		assertEquals("Sanford", customers.get(3587).getCity());
	}

	@Test
	@DisplayName("Record 3588: County is Lee")
	void CountyOfRecord3588() {
		assertEquals("Lee", customers.get(3587).getCounty());
	}

	@Test
	@DisplayName("Record 3588: State is NC")
	void StateOfRecord3588() {
		assertEquals("NC", customers.get(3587).getState());
	}

	@Test
	@DisplayName("Record 3588: ZIP is 27330")
	void ZIPOfRecord3588() {
		assertEquals("27330", customers.get(3587).getZIP());
	}

	@Test
	@DisplayName("Record 3588: Phone is 919-776-5811")
	void PhoneOfRecord3588() {
		assertEquals("919-776-5811", customers.get(3587).getPhone());
	}

	@Test
	@DisplayName("Record 3588: Fax is 919-776-9304")
	void FaxOfRecord3588() {
		assertEquals("919-776-9304", customers.get(3587).getFax());
	}

	@Test
	@DisplayName("Record 3588: Email is chet@mccluney.com")
	void EmailOfRecord3588() {
		assertEquals("chet@mccluney.com", customers.get(3587).getEmail());
	}

	@Test
	@DisplayName("Record 3588: Web is http://www.chetmccluney.com")
	void WebOfRecord3588() {
		assertEquals("http://www.chetmccluney.com", customers.get(3587).getWeb());
	}
}
