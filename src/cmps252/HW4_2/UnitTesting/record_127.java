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

@Tag("32")
class Record_127 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 127: FirstName is Destiny")
	void FirstNameOfRecord127() {
		assertEquals("Destiny", customers.get(126).getFirstName());
	}

	@Test
	@DisplayName("Record 127: LastName is Quizon")
	void LastNameOfRecord127() {
		assertEquals("Quizon", customers.get(126).getLastName());
	}

	@Test
	@DisplayName("Record 127: Company is Sawicki, Michael P Esq")
	void CompanyOfRecord127() {
		assertEquals("Sawicki, Michael P Esq", customers.get(126).getCompany());
	}

	@Test
	@DisplayName("Record 127: Address is 2609 Dearborn St")
	void AddressOfRecord127() {
		assertEquals("2609 Dearborn St", customers.get(126).getAddress());
	}

	@Test
	@DisplayName("Record 127: City is Easton")
	void CityOfRecord127() {
		assertEquals("Easton", customers.get(126).getCity());
	}

	@Test
	@DisplayName("Record 127: County is Northampton")
	void CountyOfRecord127() {
		assertEquals("Northampton", customers.get(126).getCounty());
	}

	@Test
	@DisplayName("Record 127: State is PA")
	void StateOfRecord127() {
		assertEquals("PA", customers.get(126).getState());
	}

	@Test
	@DisplayName("Record 127: ZIP is 18045")
	void ZIPOfRecord127() {
		assertEquals("18045", customers.get(126).getZIP());
	}

	@Test
	@DisplayName("Record 127: Phone is 610-258-7846")
	void PhoneOfRecord127() {
		assertEquals("610-258-7846", customers.get(126).getPhone());
	}

	@Test
	@DisplayName("Record 127: Fax is 610-258-0922")
	void FaxOfRecord127() {
		assertEquals("610-258-0922", customers.get(126).getFax());
	}

	@Test
	@DisplayName("Record 127: Email is destiny@quizon.com")
	void EmailOfRecord127() {
		assertEquals("destiny@quizon.com", customers.get(126).getEmail());
	}

	@Test
	@DisplayName("Record 127: Web is http://www.destinyquizon.com")
	void WebOfRecord127() {
		assertEquals("http://www.destinyquizon.com", customers.get(126).getWeb());
	}
}
