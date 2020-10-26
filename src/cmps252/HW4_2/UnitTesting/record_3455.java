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

@Tag("12")
class Record_3455 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3455: FirstName is Claudio")
	void FirstNameOfRecord3455() {
		assertEquals("Claudio", customers.get(3454).getFirstName());
	}

	@Test
	@DisplayName("Record 3455: LastName is Hanle")
	void LastNameOfRecord3455() {
		assertEquals("Hanle", customers.get(3454).getLastName());
	}

	@Test
	@DisplayName("Record 3455: Company is Five Flags Electrl Contr Inc")
	void CompanyOfRecord3455() {
		assertEquals("Five Flags Electrl Contr Inc", customers.get(3454).getCompany());
	}

	@Test
	@DisplayName("Record 3455: Address is 607 Bedford St")
	void AddressOfRecord3455() {
		assertEquals("607 Bedford St", customers.get(3454).getAddress());
	}

	@Test
	@DisplayName("Record 3455: City is Stamford")
	void CityOfRecord3455() {
		assertEquals("Stamford", customers.get(3454).getCity());
	}

	@Test
	@DisplayName("Record 3455: County is Fairfield")
	void CountyOfRecord3455() {
		assertEquals("Fairfield", customers.get(3454).getCounty());
	}

	@Test
	@DisplayName("Record 3455: State is CT")
	void StateOfRecord3455() {
		assertEquals("CT", customers.get(3454).getState());
	}

	@Test
	@DisplayName("Record 3455: ZIP is 6901")
	void ZIPOfRecord3455() {
		assertEquals("6901", customers.get(3454).getZIP());
	}

	@Test
	@DisplayName("Record 3455: Phone is 203-324-8565")
	void PhoneOfRecord3455() {
		assertEquals("203-324-8565", customers.get(3454).getPhone());
	}

	@Test
	@DisplayName("Record 3455: Fax is 203-324-7039")
	void FaxOfRecord3455() {
		assertEquals("203-324-7039", customers.get(3454).getFax());
	}

	@Test
	@DisplayName("Record 3455: Email is claudio@hanle.com")
	void EmailOfRecord3455() {
		assertEquals("claudio@hanle.com", customers.get(3454).getEmail());
	}

	@Test
	@DisplayName("Record 3455: Web is http://www.claudiohanle.com")
	void WebOfRecord3455() {
		assertEquals("http://www.claudiohanle.com", customers.get(3454).getWeb());
	}
}
