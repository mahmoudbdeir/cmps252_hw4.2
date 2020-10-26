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

@Tag("24")
class Record_3166 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3166: FirstName is Michelle")
	void FirstNameOfRecord3166() {
		assertEquals("Michelle", customers.get(3165).getFirstName());
	}

	@Test
	@DisplayName("Record 3166: LastName is Zee")
	void LastNameOfRecord3166() {
		assertEquals("Zee", customers.get(3165).getLastName());
	}

	@Test
	@DisplayName("Record 3166: Company is Hcx Inc")
	void CompanyOfRecord3166() {
		assertEquals("Hcx Inc", customers.get(3165).getCompany());
	}

	@Test
	@DisplayName("Record 3166: Address is 4062 Amboy Rd")
	void AddressOfRecord3166() {
		assertEquals("4062 Amboy Rd", customers.get(3165).getAddress());
	}

	@Test
	@DisplayName("Record 3166: City is Staten Island")
	void CityOfRecord3166() {
		assertEquals("Staten Island", customers.get(3165).getCity());
	}

	@Test
	@DisplayName("Record 3166: County is Richmond")
	void CountyOfRecord3166() {
		assertEquals("Richmond", customers.get(3165).getCounty());
	}

	@Test
	@DisplayName("Record 3166: State is NY")
	void StateOfRecord3166() {
		assertEquals("NY", customers.get(3165).getState());
	}

	@Test
	@DisplayName("Record 3166: ZIP is 10308")
	void ZIPOfRecord3166() {
		assertEquals("10308", customers.get(3165).getZIP());
	}

	@Test
	@DisplayName("Record 3166: Phone is 718-984-8447")
	void PhoneOfRecord3166() {
		assertEquals("718-984-8447", customers.get(3165).getPhone());
	}

	@Test
	@DisplayName("Record 3166: Fax is 718-984-3541")
	void FaxOfRecord3166() {
		assertEquals("718-984-3541", customers.get(3165).getFax());
	}

	@Test
	@DisplayName("Record 3166: Email is michelle@zee.com")
	void EmailOfRecord3166() {
		assertEquals("michelle@zee.com", customers.get(3165).getEmail());
	}

	@Test
	@DisplayName("Record 3166: Web is http://www.michellezee.com")
	void WebOfRecord3166() {
		assertEquals("http://www.michellezee.com", customers.get(3165).getWeb());
	}
}
