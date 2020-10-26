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

@Tag("27")
class Record_2754 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2754: FirstName is Merle")
	void FirstNameOfRecord2754() {
		assertEquals("Merle", customers.get(2753).getFirstName());
	}

	@Test
	@DisplayName("Record 2754: LastName is Hinkel")
	void LastNameOfRecord2754() {
		assertEquals("Hinkel", customers.get(2753).getLastName());
	}

	@Test
	@DisplayName("Record 2754: Company is Hammell, Joseph W Esq")
	void CompanyOfRecord2754() {
		assertEquals("Hammell, Joseph W Esq", customers.get(2753).getCompany());
	}

	@Test
	@DisplayName("Record 2754: Address is 4 Third Grdn Cty Pk")
	void AddressOfRecord2754() {
		assertEquals("4 Third Grdn Cty Pk", customers.get(2753).getAddress());
	}

	@Test
	@DisplayName("Record 2754: City is New Hyde Park")
	void CityOfRecord2754() {
		assertEquals("New Hyde Park", customers.get(2753).getCity());
	}

	@Test
	@DisplayName("Record 2754: County is Nassau")
	void CountyOfRecord2754() {
		assertEquals("Nassau", customers.get(2753).getCounty());
	}

	@Test
	@DisplayName("Record 2754: State is NY")
	void StateOfRecord2754() {
		assertEquals("NY", customers.get(2753).getState());
	}

	@Test
	@DisplayName("Record 2754: ZIP is 11040")
	void ZIPOfRecord2754() {
		assertEquals("11040", customers.get(2753).getZIP());
	}

	@Test
	@DisplayName("Record 2754: Phone is 516-746-4898")
	void PhoneOfRecord2754() {
		assertEquals("516-746-4898", customers.get(2753).getPhone());
	}

	@Test
	@DisplayName("Record 2754: Fax is 516-746-7146")
	void FaxOfRecord2754() {
		assertEquals("516-746-7146", customers.get(2753).getFax());
	}

	@Test
	@DisplayName("Record 2754: Email is merle@hinkel.com")
	void EmailOfRecord2754() {
		assertEquals("merle@hinkel.com", customers.get(2753).getEmail());
	}

	@Test
	@DisplayName("Record 2754: Web is http://www.merlehinkel.com")
	void WebOfRecord2754() {
		assertEquals("http://www.merlehinkel.com", customers.get(2753).getWeb());
	}
}
