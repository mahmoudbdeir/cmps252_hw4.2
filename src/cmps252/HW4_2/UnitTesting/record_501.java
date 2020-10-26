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

@Tag("39")
class Record_501 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 501: FirstName is Renaldo")
	void FirstNameOfRecord501() {
		assertEquals("Renaldo", customers.get(500).getFirstName());
	}

	@Test
	@DisplayName("Record 501: LastName is Blanchfield")
	void LastNameOfRecord501() {
		assertEquals("Blanchfield", customers.get(500).getLastName());
	}

	@Test
	@DisplayName("Record 501: Company is Neptune Sunglasses")
	void CompanyOfRecord501() {
		assertEquals("Neptune Sunglasses", customers.get(500).getCompany());
	}

	@Test
	@DisplayName("Record 501: Address is 12971 Sw 132nd Ct")
	void AddressOfRecord501() {
		assertEquals("12971 Sw 132nd Ct", customers.get(500).getAddress());
	}

	@Test
	@DisplayName("Record 501: City is Miami")
	void CityOfRecord501() {
		assertEquals("Miami", customers.get(500).getCity());
	}

	@Test
	@DisplayName("Record 501: County is Miami-Dade")
	void CountyOfRecord501() {
		assertEquals("Miami-Dade", customers.get(500).getCounty());
	}

	@Test
	@DisplayName("Record 501: State is FL")
	void StateOfRecord501() {
		assertEquals("FL", customers.get(500).getState());
	}

	@Test
	@DisplayName("Record 501: ZIP is 33186")
	void ZIPOfRecord501() {
		assertEquals("33186", customers.get(500).getZIP());
	}

	@Test
	@DisplayName("Record 501: Phone is 305-252-6495")
	void PhoneOfRecord501() {
		assertEquals("305-252-6495", customers.get(500).getPhone());
	}

	@Test
	@DisplayName("Record 501: Fax is 305-252-4796")
	void FaxOfRecord501() {
		assertEquals("305-252-4796", customers.get(500).getFax());
	}

	@Test
	@DisplayName("Record 501: Email is renaldo@blanchfield.com")
	void EmailOfRecord501() {
		assertEquals("renaldo@blanchfield.com", customers.get(500).getEmail());
	}

	@Test
	@DisplayName("Record 501: Web is http://www.renaldoblanchfield.com")
	void WebOfRecord501() {
		assertEquals("http://www.renaldoblanchfield.com", customers.get(500).getWeb());
	}
}
