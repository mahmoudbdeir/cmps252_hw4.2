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

@Tag("16")
class Record_4805 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4805: FirstName is Tad")
	void FirstNameOfRecord4805() {
		assertEquals("Tad", customers.get(4804).getFirstName());
	}

	@Test
	@DisplayName("Record 4805: LastName is Frie")
	void LastNameOfRecord4805() {
		assertEquals("Frie", customers.get(4804).getLastName());
	}

	@Test
	@DisplayName("Record 4805: Company is Delta Waverly News Herald")
	void CompanyOfRecord4805() {
		assertEquals("Delta Waverly News Herald", customers.get(4804).getCompany());
	}

	@Test
	@DisplayName("Record 4805: Address is Box #-669")
	void AddressOfRecord4805() {
		assertEquals("Box #-669", customers.get(4804).getAddress());
	}

	@Test
	@DisplayName("Record 4805: City is Avila Beach")
	void CityOfRecord4805() {
		assertEquals("Avila Beach", customers.get(4804).getCity());
	}

	@Test
	@DisplayName("Record 4805: County is San Luis Obispo")
	void CountyOfRecord4805() {
		assertEquals("San Luis Obispo", customers.get(4804).getCounty());
	}

	@Test
	@DisplayName("Record 4805: State is CA")
	void StateOfRecord4805() {
		assertEquals("CA", customers.get(4804).getState());
	}

	@Test
	@DisplayName("Record 4805: ZIP is 93424")
	void ZIPOfRecord4805() {
		assertEquals("93424", customers.get(4804).getZIP());
	}

	@Test
	@DisplayName("Record 4805: Phone is 805-595-4584")
	void PhoneOfRecord4805() {
		assertEquals("805-595-4584", customers.get(4804).getPhone());
	}

	@Test
	@DisplayName("Record 4805: Fax is 805-595-5787")
	void FaxOfRecord4805() {
		assertEquals("805-595-5787", customers.get(4804).getFax());
	}

	@Test
	@DisplayName("Record 4805: Email is tad@frie.com")
	void EmailOfRecord4805() {
		assertEquals("tad@frie.com", customers.get(4804).getEmail());
	}

	@Test
	@DisplayName("Record 4805: Web is http://www.tadfrie.com")
	void WebOfRecord4805() {
		assertEquals("http://www.tadfrie.com", customers.get(4804).getWeb());
	}
}
