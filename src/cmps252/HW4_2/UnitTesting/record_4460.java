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

@Tag("35")
class Record_4460 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4460: FirstName is Shirley")
	void FirstNameOfRecord4460() {
		assertEquals("Shirley", customers.get(4459).getFirstName());
	}

	@Test
	@DisplayName("Record 4460: LastName is Lanphear")
	void LastNameOfRecord4460() {
		assertEquals("Lanphear", customers.get(4459).getLastName());
	}

	@Test
	@DisplayName("Record 4460: Company is Brod Dugan Co Inc")
	void CompanyOfRecord4460() {
		assertEquals("Brod Dugan Co Inc", customers.get(4459).getCompany());
	}

	@Test
	@DisplayName("Record 4460: Address is 5300 Belmont Rd")
	void AddressOfRecord4460() {
		assertEquals("5300 Belmont Rd", customers.get(4459).getAddress());
	}

	@Test
	@DisplayName("Record 4460: City is Downers Grove")
	void CityOfRecord4460() {
		assertEquals("Downers Grove", customers.get(4459).getCity());
	}

	@Test
	@DisplayName("Record 4460: County is DuPage")
	void CountyOfRecord4460() {
		assertEquals("DuPage", customers.get(4459).getCounty());
	}

	@Test
	@DisplayName("Record 4460: State is IL")
	void StateOfRecord4460() {
		assertEquals("IL", customers.get(4459).getState());
	}

	@Test
	@DisplayName("Record 4460: ZIP is 60515")
	void ZIPOfRecord4460() {
		assertEquals("60515", customers.get(4459).getZIP());
	}

	@Test
	@DisplayName("Record 4460: Phone is 630-969-7403")
	void PhoneOfRecord4460() {
		assertEquals("630-969-7403", customers.get(4459).getPhone());
	}

	@Test
	@DisplayName("Record 4460: Fax is 630-969-7991")
	void FaxOfRecord4460() {
		assertEquals("630-969-7991", customers.get(4459).getFax());
	}

	@Test
	@DisplayName("Record 4460: Email is shirley@lanphear.com")
	void EmailOfRecord4460() {
		assertEquals("shirley@lanphear.com", customers.get(4459).getEmail());
	}

	@Test
	@DisplayName("Record 4460: Web is http://www.shirleylanphear.com")
	void WebOfRecord4460() {
		assertEquals("http://www.shirleylanphear.com", customers.get(4459).getWeb());
	}
}
