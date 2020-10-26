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

@Tag("30")
class Record_4220 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4220: FirstName is Trevor")
	void FirstNameOfRecord4220() {
		assertEquals("Trevor", customers.get(4219).getFirstName());
	}

	@Test
	@DisplayName("Record 4220: LastName is Selca")
	void LastNameOfRecord4220() {
		assertEquals("Selca", customers.get(4219).getLastName());
	}

	@Test
	@DisplayName("Record 4220: Company is Pro Signs Inc")
	void CompanyOfRecord4220() {
		assertEquals("Pro Signs Inc", customers.get(4219).getCompany());
	}

	@Test
	@DisplayName("Record 4220: Address is 283 Genesee St")
	void AddressOfRecord4220() {
		assertEquals("283 Genesee St", customers.get(4219).getAddress());
	}

	@Test
	@DisplayName("Record 4220: City is Rochester")
	void CityOfRecord4220() {
		assertEquals("Rochester", customers.get(4219).getCity());
	}

	@Test
	@DisplayName("Record 4220: County is Monroe")
	void CountyOfRecord4220() {
		assertEquals("Monroe", customers.get(4219).getCounty());
	}

	@Test
	@DisplayName("Record 4220: State is NY")
	void StateOfRecord4220() {
		assertEquals("NY", customers.get(4219).getState());
	}

	@Test
	@DisplayName("Record 4220: ZIP is 14611")
	void ZIPOfRecord4220() {
		assertEquals("14611", customers.get(4219).getZIP());
	}

	@Test
	@DisplayName("Record 4220: Phone is 585-235-6865")
	void PhoneOfRecord4220() {
		assertEquals("585-235-6865", customers.get(4219).getPhone());
	}

	@Test
	@DisplayName("Record 4220: Fax is 585-235-6154")
	void FaxOfRecord4220() {
		assertEquals("585-235-6154", customers.get(4219).getFax());
	}

	@Test
	@DisplayName("Record 4220: Email is trevor@selca.com")
	void EmailOfRecord4220() {
		assertEquals("trevor@selca.com", customers.get(4219).getEmail());
	}

	@Test
	@DisplayName("Record 4220: Web is http://www.trevorselca.com")
	void WebOfRecord4220() {
		assertEquals("http://www.trevorselca.com", customers.get(4219).getWeb());
	}
}
