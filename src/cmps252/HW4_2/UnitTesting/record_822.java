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

@Tag("8")
class Record_822 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 822: FirstName is Gregorio")
	void FirstNameOfRecord822() {
		assertEquals("Gregorio", customers.get(821).getFirstName());
	}

	@Test
	@DisplayName("Record 822: LastName is Rhyngold")
	void LastNameOfRecord822() {
		assertEquals("Rhyngold", customers.get(821).getLastName());
	}

	@Test
	@DisplayName("Record 822: Company is Days Inn")
	void CompanyOfRecord822() {
		assertEquals("Days Inn", customers.get(821).getCompany());
	}

	@Test
	@DisplayName("Record 822: Address is 705 Blackstone Bldge")
	void AddressOfRecord822() {
		assertEquals("705 Blackstone Bldge", customers.get(821).getAddress());
	}

	@Test
	@DisplayName("Record 822: City is Jacksonville")
	void CityOfRecord822() {
		assertEquals("Jacksonville", customers.get(821).getCity());
	}

	@Test
	@DisplayName("Record 822: County is Duval")
	void CountyOfRecord822() {
		assertEquals("Duval", customers.get(821).getCounty());
	}

	@Test
	@DisplayName("Record 822: State is FL")
	void StateOfRecord822() {
		assertEquals("FL", customers.get(821).getState());
	}

	@Test
	@DisplayName("Record 822: ZIP is 32202")
	void ZIPOfRecord822() {
		assertEquals("32202", customers.get(821).getZIP());
	}

	@Test
	@DisplayName("Record 822: Phone is 904-354-4420")
	void PhoneOfRecord822() {
		assertEquals("904-354-4420", customers.get(821).getPhone());
	}

	@Test
	@DisplayName("Record 822: Fax is 904-354-2345")
	void FaxOfRecord822() {
		assertEquals("904-354-2345", customers.get(821).getFax());
	}

	@Test
	@DisplayName("Record 822: Email is gregorio@rhyngold.com")
	void EmailOfRecord822() {
		assertEquals("gregorio@rhyngold.com", customers.get(821).getEmail());
	}

	@Test
	@DisplayName("Record 822: Web is http://www.gregoriorhyngold.com")
	void WebOfRecord822() {
		assertEquals("http://www.gregoriorhyngold.com", customers.get(821).getWeb());
	}
}
