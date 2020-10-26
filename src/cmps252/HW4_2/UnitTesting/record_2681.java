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

@Tag("19")
class Record_2681 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2681: FirstName is Jennifer")
	void FirstNameOfRecord2681() {
		assertEquals("Jennifer", customers.get(2680).getFirstName());
	}

	@Test
	@DisplayName("Record 2681: LastName is Scheurer")
	void LastNameOfRecord2681() {
		assertEquals("Scheurer", customers.get(2680).getLastName());
	}

	@Test
	@DisplayName("Record 2681: Company is Nyl J Beller Ltd")
	void CompanyOfRecord2681() {
		assertEquals("Nyl J Beller Ltd", customers.get(2680).getCompany());
	}

	@Test
	@DisplayName("Record 2681: Address is 1036 E Aven  #-104")
	void AddressOfRecord2681() {
		assertEquals("1036 E Aven  #-104", customers.get(2680).getAddress());
	}

	@Test
	@DisplayName("Record 2681: City is Lancaster")
	void CityOfRecord2681() {
		assertEquals("Lancaster", customers.get(2680).getCity());
	}

	@Test
	@DisplayName("Record 2681: County is Los Angeles")
	void CountyOfRecord2681() {
		assertEquals("Los Angeles", customers.get(2680).getCounty());
	}

	@Test
	@DisplayName("Record 2681: State is CA")
	void StateOfRecord2681() {
		assertEquals("CA", customers.get(2680).getState());
	}

	@Test
	@DisplayName("Record 2681: ZIP is 93535")
	void ZIPOfRecord2681() {
		assertEquals("93535", customers.get(2680).getZIP());
	}

	@Test
	@DisplayName("Record 2681: Phone is 661-267-2626")
	void PhoneOfRecord2681() {
		assertEquals("661-267-2626", customers.get(2680).getPhone());
	}

	@Test
	@DisplayName("Record 2681: Fax is 661-267-7725")
	void FaxOfRecord2681() {
		assertEquals("661-267-7725", customers.get(2680).getFax());
	}

	@Test
	@DisplayName("Record 2681: Email is jennifer@scheurer.com")
	void EmailOfRecord2681() {
		assertEquals("jennifer@scheurer.com", customers.get(2680).getEmail());
	}

	@Test
	@DisplayName("Record 2681: Web is http://www.jenniferscheurer.com")
	void WebOfRecord2681() {
		assertEquals("http://www.jenniferscheurer.com", customers.get(2680).getWeb());
	}
}
