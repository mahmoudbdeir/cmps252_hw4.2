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

@Tag("37")
class Record_140 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 140: FirstName is Lamont")
	void FirstNameOfRecord140() {
		assertEquals("Lamont", customers.get(139).getFirstName());
	}

	@Test
	@DisplayName("Record 140: LastName is Cerino")
	void LastNameOfRecord140() {
		assertEquals("Cerino", customers.get(139).getLastName());
	}

	@Test
	@DisplayName("Record 140: Company is Mcclain & Strauss Pa")
	void CompanyOfRecord140() {
		assertEquals("Mcclain & Strauss Pa", customers.get(139).getCompany());
	}

	@Test
	@DisplayName("Record 140: Address is 4250 Old William Penn Hwy")
	void AddressOfRecord140() {
		assertEquals("4250 Old William Penn Hwy", customers.get(139).getAddress());
	}

	@Test
	@DisplayName("Record 140: City is Monroeville")
	void CityOfRecord140() {
		assertEquals("Monroeville", customers.get(139).getCity());
	}

	@Test
	@DisplayName("Record 140: County is Allegheny")
	void CountyOfRecord140() {
		assertEquals("Allegheny", customers.get(139).getCounty());
	}

	@Test
	@DisplayName("Record 140: State is PA")
	void StateOfRecord140() {
		assertEquals("PA", customers.get(139).getState());
	}

	@Test
	@DisplayName("Record 140: ZIP is 15146")
	void ZIPOfRecord140() {
		assertEquals("15146", customers.get(139).getZIP());
	}

	@Test
	@DisplayName("Record 140: Phone is 412-372-4087")
	void PhoneOfRecord140() {
		assertEquals("412-372-4087", customers.get(139).getPhone());
	}

	@Test
	@DisplayName("Record 140: Fax is 412-372-4561")
	void FaxOfRecord140() {
		assertEquals("412-372-4561", customers.get(139).getFax());
	}

	@Test
	@DisplayName("Record 140: Email is lamont@cerino.com")
	void EmailOfRecord140() {
		assertEquals("lamont@cerino.com", customers.get(139).getEmail());
	}

	@Test
	@DisplayName("Record 140: Web is http://www.lamontcerino.com")
	void WebOfRecord140() {
		assertEquals("http://www.lamontcerino.com", customers.get(139).getWeb());
	}
}
