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

@Tag("14")
class Record_2758 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2758: FirstName is Dina")
	void FirstNameOfRecord2758() {
		assertEquals("Dina", customers.get(2757).getFirstName());
	}

	@Test
	@DisplayName("Record 2758: LastName is Wydemann")
	void LastNameOfRecord2758() {
		assertEquals("Wydemann", customers.get(2757).getLastName());
	}

	@Test
	@DisplayName("Record 2758: Company is Fox, Peter M Esq")
	void CompanyOfRecord2758() {
		assertEquals("Fox, Peter M Esq", customers.get(2757).getCompany());
	}

	@Test
	@DisplayName("Record 2758: Address is 694 Cypress St")
	void AddressOfRecord2758() {
		assertEquals("694 Cypress St", customers.get(2757).getAddress());
	}

	@Test
	@DisplayName("Record 2758: City is New Milford")
	void CityOfRecord2758() {
		assertEquals("New Milford", customers.get(2757).getCity());
	}

	@Test
	@DisplayName("Record 2758: County is Bergen")
	void CountyOfRecord2758() {
		assertEquals("Bergen", customers.get(2757).getCounty());
	}

	@Test
	@DisplayName("Record 2758: State is NJ")
	void StateOfRecord2758() {
		assertEquals("NJ", customers.get(2757).getState());
	}

	@Test
	@DisplayName("Record 2758: ZIP is 7646")
	void ZIPOfRecord2758() {
		assertEquals("7646", customers.get(2757).getZIP());
	}

	@Test
	@DisplayName("Record 2758: Phone is 201-818-1470")
	void PhoneOfRecord2758() {
		assertEquals("201-818-1470", customers.get(2757).getPhone());
	}

	@Test
	@DisplayName("Record 2758: Fax is 201-818-2111")
	void FaxOfRecord2758() {
		assertEquals("201-818-2111", customers.get(2757).getFax());
	}

	@Test
	@DisplayName("Record 2758: Email is dina@wydemann.com")
	void EmailOfRecord2758() {
		assertEquals("dina@wydemann.com", customers.get(2757).getEmail());
	}

	@Test
	@DisplayName("Record 2758: Web is http://www.dinawydemann.com")
	void WebOfRecord2758() {
		assertEquals("http://www.dinawydemann.com", customers.get(2757).getWeb());
	}
}
